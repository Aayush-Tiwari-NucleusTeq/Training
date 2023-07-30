package Day_7.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program illustrating implementation of comparable interface..");
        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(101, "Aayush Tiwari", 23));
        emplist.add(new Employee(102, "John Mark", 17));
        emplist.add(new Employee(167, "David Warner", 15));
        emplist.add(new Employee(254, "Virat Kohli", 25));

        Collections.sort(emplist);
        for (Employee employee : emplist) {
            System.out.println("Name : " + employee.name + " and age : " + employee.age);
        }
    }
}
