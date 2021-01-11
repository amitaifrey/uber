package host;
import com.google.protobuf.util.JsonFormat;
import logic.Logic;
import rpc.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import zkconn.ZKManagerImpl;
import generated.Configuration;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class main {
    public static HashMap<String, Logic> logics;

    public static void main(String[] argv) {
        // TODO create timeouts and retries
        // TODO add lock to each logic?
        // TODO docker-compose + ensemble?
        try {
            ZKManagerImpl conn = new ZKManagerImpl("172.27.111.120:2181"); // zk default
            TimeUnit.SECONDS.sleep(10);

            String text = Files.readString(Paths.get(argv[0]));
            var conf = Configuration.newBuilder();

            try {
                JsonFormat.parser().ignoringUnknownFields().merge(text, conf);
            } catch(Exception e) {
                System.out.println("Conf not loaded");
                e.printStackTrace();
                return;
            }

            logics = new HashMap<String, Logic>();
            for (var cityName : conf.getMyCitiesList()) {
                var city = conf.getAllCitiesList().stream().filter(c -> c.getName().equals(cityName)).collect(Collectors.toList()).get(0);
                System.out.println(Arrays.toString(InetAddress.getLocalHost().getAddress()));
                var logic = new Logic(conn, conf.getAllCitiesList(), city, Inet4Address.getLocalHost().getHostAddress());
                logics.put(cityName, logic);
            }

            UberRPCServer server = new UberRPCServer(8980, logics);
            server.start();
            SpringApplication.run(main.class);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
