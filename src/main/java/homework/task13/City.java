package homework.task13;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class City implements Serializable {

    public static final long serialVersionUID = -1281698354240839372L;

    private final long id;
    private final String name;
    private final float longitude;
    private final float latitude;
    private final String countryCode;
    private final int population;

    public City(long id, String name, float longitude, float latitude, String code, int population) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.countryCode = code;
        this.population = population;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    public static Set<City> countryCodes(Collection<City> cities) {
        for (City city : cities) {
            if (city.getCountryCode().contains("")) { // DO ZROBIENIA
            }
        }
        return null;
    }

        public static List<City> citiesInPoland (Collection < City > cities) {
            for (City c : cities) {
                if (c.getCountryCode().equals("PL")) {  // do zrobienia

                }
            }
            return null;
        }

        public static List<City> citiesMoreThan1_000_000 (Collection<City> cities) {
            List<City> cities1 = new ArrayList<City>();
            for (City city : cities) {
                if (1_000_000 < city.getPopulation()) {
                    cities1.add(city);
                }
            }
            return cities1;
        }


        @Override
        public String toString () {
            return "City{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", longitude=" + longitude +
                    ", latitude=" + latitude +
                    ", code='" + countryCode + '\'' +
                    ", population=" + population +
                    '}';
        }
    }


