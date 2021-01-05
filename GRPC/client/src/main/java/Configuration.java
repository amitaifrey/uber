import java.net.InetAddress;
import java.util.List;

public class Configuration {
    List<City> all_cities;
    List<MyCity> my_cities;

    public static class City {
        String name;
        int x;
        int y;
    }

    public static class MyCity extends City {
        int zk_port;
    }
}



/* Conf in docker:
Default port for all zk
ZK service ensemble by city
 */