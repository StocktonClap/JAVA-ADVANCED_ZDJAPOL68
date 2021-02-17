package homework.task13;

import java.util.Collection;

public class CityPaginator {

    Collection<City> cities;
    double sideSize;

    public CityPaginator(Collection<City> cities, double sideSize) {
        this.cities = cities;
        this.sideSize = sideSize;
    }

    public void current () {}
    public void next() {}
    public void previous() {}
    public void reset () {}
    public void skip (int page) {}
}
