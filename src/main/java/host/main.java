package host;
import logic.Logic;
import rpc.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import zkconn.ZKManagerImpl;
import generated.City;

import java.util.Arrays;
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
            // TODO conf like human beings + dockerzz
            ZKManagerImpl conn = new ZKManagerImpl("172.27.103.235:2181"); // zk default
            TimeUnit.SECONDS.sleep(10);

//            var zkConnections = new HashMap<String, ZKManagerImpl>();
//            for (var city : conf.my_cities) {
//                zkConnections.put(city.name, new ZKManagerImpl("localhost:"+city.zk_port));
//            }
//            zkConnections.put("all", all);
            var city1 = generated.City.newBuilder().setName("city1").setX(0).setY(0).build();
            var city2 = generated.City.newBuilder().setName("city2").setX(6).setY(6).build();
            var city3 = generated.City.newBuilder().setName("city3").setX(0).setY(6).build();
            var allCities = Arrays.asList(city1, city2, city3);

            var logic1 = new Logic(conn, allCities, city1, "127.0.0.1");
            var logic2 = new Logic(conn, allCities, city2, "127.0.0.1");
            var logic3 = new Logic(conn, allCities, city3, "127.0.0.1");

            logics = new HashMap<String, Logic>();
            logics.put("city1", logic1);
            logics.put("city2", logic2);
            logics.put("city3", logic3);
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
