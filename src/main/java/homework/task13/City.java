package homework.task13;

import java.io.Serializable;
import java.util.*;

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
        Set<City> countryCodes = new HashSet<>();
        for (City city : cities) {
            if (!city.getCountryCode().isEmpty()) { // DO ZROBIENIA
                countryCodes.add(city);
            }
        }
        return countryCodes;
    }

    public static List<City> citiesInPoland (Collection <City> cities) {
        List<City> polishCities = new ArrayList<>();
        for (City city : cities) {
            if (city.getCountryCode().equals("PL")) {  // do zrobienia
                polishCities.add(city);
            }
        }
        return polishCities;
    }

        public static List<City> citiesMoreThan1_000_000 (Collection <City> cities) {
            List<City> citiesMoreThan1_000_000 = new ArrayList<City>();
            for (City city : cities) {
                if (1_000_000 < city.getPopulation()) {
                    citiesMoreThan1_000_000.add(city);
                }
            }
            return citiesMoreThan1_000_000;
        }

        public static Map<String, City> mapNameCities (Map<String, City> cities) {    //    DO ZROBIENIA !!!
        return null;
        }

        public static Map<Integer, City> mapLatitudeCities (Map<Integer, City> cities) {
        return null;
        }

    public static List<City> citiesLessThan10_000(Collection<City> cities) { // szukanie i usuwanie miast poniżej 10_000
        List<City> citiesSmallerThan10_000 = new ArrayList<>(cities);
        Iterator<City> iterator = citiesSmallerThan10_000.iterator();
        while (iterator.hasNext()) {
            City city = iterator.next();
            if (10_000 > city.getPopulation()) {
                iterator.remove();
            }
        }
        return citiesSmallerThan10_000;
    }

    public static List<City> citiesOverThan1_000_000AndDe(Collection<City> cities) {  // szukanie i usuwanie miast powyżej 1_000_000 i DE
        List<City> citiesOverThan1_000_000AndDe = citiesMoreThan1_000_000(cities);
        Iterator<City> iterator = citiesOverThan1_000_000AndDe.iterator();
        while (iterator.hasNext()) {
            City city = iterator.next();
            if (city.getCountryCode().equals("DE")) {
                iterator.remove();
            }
        }
        return citiesOverThan1_000_000AndDe;
    }

    public static List<City> newOldCities (Collection<City> cities) {  //  zamiana Nowa na Stara
        List<City> polishCities = City.citiesInPoland(cities);
        List<City> newOldCities = new ArrayList<>();
        Iterator<City> iterator = polishCities.iterator();
        while (iterator.hasNext()) {
            City city = iterator.next();
            if (city.getName().contains("Nowa")) { // do zrobienia
                newOldCities.add(new City(city.getId(), city.getName().replace("Nowa", "Stara"), city.getLongitude(), city.getLatitude(), city.getCountryCode(), city.getPopulation()));
            }
            newOldCities.add(city);
        }
        return newOldCities;
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


