package Day2.Encapsulation;

class Person {
    private String name;
    private int age;
 
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public int getAge() { return age; }
 
    public void setAge(int age) { this.age = age; }

    public void display()
    {
        System.out.println("The person name is " + this.name + " with age " + this.age);
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("Program illustrating concept of Encapsulation");
        Person person1 = new Person();
        person1.setAge(23);
        person1.setName("Aayush");
        person1.display();
    }
}
