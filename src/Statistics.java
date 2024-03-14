import java.util.List;

public class Statistics {

    public static double computeSumOfSalaries(List<EmployeeData> combined) {
        double sumOfSalaries = 0.0;
        for(EmployeeData e : combined) {
            sumOfSalaries += e.getSalary();
        }
        return sumOfSalaries;
    }
}
