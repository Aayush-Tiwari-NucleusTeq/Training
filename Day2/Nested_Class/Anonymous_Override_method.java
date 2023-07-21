package Day2.Nested_Class;

abstract class Demo {
    abstract void diplay();
}

public class Anonymous_Override_method {
    public static void main(String[] args) {
        System.out.println("Program illustrating overriding method of an Anonymous inner class multiple times-->");
        System.out.println();
        Demo demo = new Demo() {
            @Override
            void diplay() {
                System.out.println("Displaying the anonymous method which is overridden");
            }
        };
        demo.diplay();
    }
}
