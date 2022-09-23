import java.util.Comparator;
import java.util.Locale;

public class CityNameComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
    }


}
