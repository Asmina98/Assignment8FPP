import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {

    @Override
    public int compare(Marketing m1, Marketing m2) {
        return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
    }
}
