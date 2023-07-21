class Employee{
    int EmpId;
    String EmpName;
    static String CompanyName = "NucleusTeq";

    Employee(int EmpId, String EmpName){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
    }

    public void display(){
        System.out.println("The employee with name " + EmpName + " with employee id " + EmpId);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        System.out.println("Program illustrating static variable use");
        Employee emp1 = new Employee(151,"Aayush Tiwari");
        emp1.display();
    }
}
