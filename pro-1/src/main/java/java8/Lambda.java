package java8;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Lambda {
    /** 1.使用匿名内部类实现比较器 */
    @Test
    public void comparetorTest(){
        //1
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
            }
        });
        System.out.println(list);//[2,1]

        //2
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//降序
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
    }
    /** 2.lambda表达式 替换匿名内部类 */

    @Test
    public void lambdaTest(){
        Comparator<Integer> comparator1 = (x,y)->y-x;//降序
        Comparator<Integer> comparator2 = (x,y)->Integer.compare(y,x);//降序
        TreeSet<Integer> treeSet = new TreeSet<>(comparator1);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);//[2,1]
    }

    /** 3.线程 */
    @Test
    public void threadTest(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread..."+Thread.currentThread().getName());
                //Thread-0
            }
        }).start();
        System.out.println(Thread.currentThread().getName());//main
        System.out.println("-------");
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
        //Thread-1
    }

    /** 员工类的过滤 */
    @Test
    public void employeeTest(){
        Employee e1=new Employee(20,1800);
        Employee e2=new Employee(30,2800);
        Employee e3=new Employee(40,3800);
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        //1.策略方法过滤
        List<Employee> emps = Employee.filterEmployee(employees,new EmployeeSalaryFilter());
        System.out.println(emps);//[Employee(age=30, salary=2800), Employee(age=40, salary=3800)]
        //2.上述方式使用匿名内部类改进
        List<Employee> emps2 = Employee.filterEmployee(employees, new MyPredicate<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getSalary()>2000;
            }
        });
        System.out.println(emps2);
        //[Employee(age=30, salary=2800), Employee(age=40, salary=3800)]

        //3.lambda
        List<Employee> emps3 = Employee.filterEmployee(employees,(e)->e.getSalary()>2000);
        emps3.forEach(System.out::println);

        //4.stream() api
        List<Employee> emps4 = employees
                .stream()
                .filter(e->e.getSalary()>2000)
                .collect(Collectors.toList());
        System.out.println(emps4);
        //[Employee(age=30, salary=2800), Employee(age=40, salary=3800)]
        System.out.println("------------------");

        employees.stream()
                .map(Employee::getAge)
                .forEach(System.out::println);
    }

}
