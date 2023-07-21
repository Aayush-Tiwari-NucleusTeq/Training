package Day2.Nested_Class;

// Through class
abstract class Person{
    abstract void run();
}

// Through interface
interface Stuff{
    void dontknow();
}

public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        System.out.println("Program illustrating Anonymous Inner Class -->");
        System.out.println();
        Person person = new Person() {
            
            void run(){
                System.out.println("Just running in the garden");
            }
        };
        person.run();
        System.out.println();

        Stuff stuff = new Stuff() {

            @Override
            public void dontknow() {
                System.out.println("Don't know method is working finally");
            }
        };
        stuff.dontknow();
    }
}
