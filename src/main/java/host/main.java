package host;
import logic.Logic;
import rpc.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import zkconn.ZKManagerImpl;
import generated.City;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class main {
    public static HashMap<String, Logic> logics;

    public static void main(String[] argv) {
        /*
        1. attach to zookeepers
        2. create rpc client
        3. create manager(receives client)
        4. create RPC + REST servers (receive manager)
        5. ???
        6. profit
         */
        try {
            ZKManagerImpl conn = new ZKManagerImpl("172.27.103.235:2181"); // zk default

//            var zkConnections = new HashMap<String, ZKManagerImpl>();
//            for (var city : conf.my_cities) {
//                zkConnections.put(city.name, new ZKManagerImpl("localhost:"+city.zk_port));
//            }
//            zkConnections.put("all", all);
            TimeUnit.SECONDS.sleep(10);
            var city1 = generated.City.newBuilder().setName("city").setX(0).setY(0).build();
            var city2 = generated.City.newBuilder().setName("city2").setX(6).setY(6).build();
            var logic = new Logic(conn, new LinkedList<City>(){city1, city2}, city1, "1.2.3.4");
            logics = new HashMap<String, Logic>();
            logics.put("city", logic);
            //Logic(ZKManagerImpl allConn, ZKManagerImpl myConn, List< generated.City > allCities, generated.City myCity) throws KeeperException, InterruptedException {
            // rpc is on demand

            UberRPCServer server = new UberRPCServer(8980, logics);
            server.start();
            SpringApplication.run(main.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
