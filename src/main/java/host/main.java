package host;
import logic.Logic;
import rpc.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import conf.Configuration;
import zkconn.ZKManagerImpl;
import java.util.HashMap;

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
            var conf = new Configuration();
            ZKManagerImpl all = new ZKManagerImpl("172.27.111.52:2181"); // zk default

            var zkConnections = new HashMap<String, ZKManagerImpl>();
//            for (var city : conf.my_cities) {
//                zkConnections.put(city.name, new ZKManagerImpl("localhost:"+city.zk_port));
//            }
            zkConnections.put("all", all);


            logic = new Logic(conf, zkConnections);
            // rpc is on demand

            UberRPCServer server = new UberRPCServer(8980, logic);
            server.start();
            SpringApplication.run(main.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
