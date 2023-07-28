package SubclassesIOStream;

import java.io.Serializable;

public class Employee implements Serializable{
    public int id;
    public String name;
    public String address;  
    Employee(int id, String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }  
}
