package Day_7.Comparable;

public class Employee implements Comparable<Employee>{
    int empId;
    String name;
    int age;

    Employee(int empId,String name,int age){
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        if(age > o.age)
            return 1;
        else 
            return -1;
    }
}
