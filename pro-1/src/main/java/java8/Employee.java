package java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter @AllArgsConstructor @ToString
public class Employee {
    private int age;
    private int salary;

    public static List<Employee> filterEmployee(List<Employee> emps,MyPredicate<Employee> myPredicate){
        List<Employee> res = new ArrayList<>();
        for (Employee emp : emps) {
            if(myPredicate.filter(emp)){
                res.add(emp);
            }
        }
        return res;
    }



}
