import java.util.List;

public class DetailPrinter {

    private List<Employee> employeeList;

    public DetailPrinter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void printDetails(){
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }
}
