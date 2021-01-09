package host;
import logic.Logic;
import org.apache.zookeeper.KeeperException;
import rpc.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import zkconn.ZKManagerImpl;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import generated.City;
import generated.Configuration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class main {
    public static Logic logic;

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
            ZKManagerImpl all = new ZKManagerImpl("172.27.101.232:2181"); // zk default

            var zkConnections = new HashMap<String, ZKManagerImpl>();
//            for (var city : conf.my_cities) {
//                zkConnections.put(city.name, new ZKManagerImpl("localhost:"+city.zk_port));
//            }
            zkConnections.put("all", all);
            TimeUnit.SECONDS.sleep(10);
            var city = generated.City.newBuilder().setName("city").build();
            logic = new Logic(all, all, new LinkedList<City>(), city);
            //Logic(ZKManagerImpl allConn, ZKManagerImpl myConn, List< generated.City > allCities, generated.City myCity) throws KeeperException, InterruptedException {
            // rpc is on demand

            UberRPCServer server = new UberRPCServer(8980, logic);
            server.start();
            SpringApplication.run(main.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
