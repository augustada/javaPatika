import java.util.Comparator;

public class nameComparator implements Comparator<Brands> {


    @Override
    public int compare(Brands o1, Brands o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
