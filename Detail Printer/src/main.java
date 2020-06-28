import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Employee employee = new Employee("Dudi");
        Manager manager = new Manager("Adit" , new ArrayList<>());


        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(employee);

        DetailPrinter printer = new DetailPrinter(employees);
        printer.printDetails();

    }
}
