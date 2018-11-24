package java8;

public class EmployeeSalaryFilter implements MyPredicate<Employee> {
    @Override
    public boolean filter(Employee emp) {
        return emp.getSalary()>2000;
    }
}
