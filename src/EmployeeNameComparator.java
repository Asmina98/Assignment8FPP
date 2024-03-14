import java.util.Comparator;

public class EmployeeNameComparator  implements Comparator<Marketing> {

    @Override
    public int compare(Marketing m1, Marketing m2) {
        return m1.getEmployeename().compareTo(m2.getEmployeename());
    }
}
