package P3;
// Single Responsibility Principle
public class Employee {
    private final String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
class EmployeeSaver{
    public void save(Employee employee) {
        System.out.println("Saving employee details for " + employee.getName());
    }
}
class EmployeePayer {
    public void calculatePay(Employee employee) {
        System.out.println("Calculating pay for " + employee.getName());
    }
}

class EmployeeReportGenerator {
    public void printReport(Employee employee) {
        System.out.println("Printing report for " + employee.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ARR");
        EmployeeSaver es = new EmployeeSaver();
        es.save(employee);
        EmployeePayer ep = new EmployeePayer();
        ep.calculatePay(employee);
        EmployeeReportGenerator erg = new EmployeeReportGenerator();
        erg.printReport(employee);
    }
}