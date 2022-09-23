import java.util.Comparator;

public class DistrictAndNameComparator implements Comparator<City> {
    Comparator<City> c;

    public DistrictAndNameComparator() {
        this.c = (p, o) ->
                p.district.compareTo(o.district);

        this.c = c.thenComparing((p, o) ->
                p.name.compareTo(o.name));

    }

    @Override
    public int compare(City o1, City o2) {

        return c.compare(o1, o2);
    }
}
