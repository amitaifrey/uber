import org.springframework.boot.SpringApplication;

import java.util.HashMap;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class main {
    static Logic logic;

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
            ZKManagerImpl all = new ZKManagerImpl("localhost:2821"); // zk default

            var zkConnections = new HashMap<String, ZKManagerImpl>();
            for (var city : conf.my_cities) {
                zkConnections.put(city.name, new ZKManagerImpl("localhost:"+city.zk_port));
            }


            logic = new Logic(conf, zkConnections);
            // rpc is on demand

            UberRPCServer server = new UberRPCServer(8980, logic);
            server.start();
            SpringApplication.run(UberController.class);
        } catch (Exception ignored) {

        }
    }
}
