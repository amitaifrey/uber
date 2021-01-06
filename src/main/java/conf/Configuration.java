package conf;

import java.util.List;

public class Configuration {
    public List<City> all_cities;
    public List<MyCity> my_cities;

    public static class City {
        public String name;
        public int x;
        public int y;
    }

    public static class MyCity extends City {
        public int zk_port;
    }
}



/* Conf in docker:
Default port for all zk
ZK service ensemble by city
 */