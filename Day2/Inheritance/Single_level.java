package Day2.Inheritance;

// ----------------------------------------| Single-level inheritance |----------------------------------------
class A {
    int a, b;

    void display() {
        System.out.println("Inside class A values =" + a + " " + b);
    }
}

class B extends A {
    int c;

    void show() {
        System.out.println("Inside Class B values=" + a + " " + b + " " + c);
    }
}


public class Single_level {
    public static void main(String[] args) {
        System.out.println("Program illustrating types of inheritance");
        System.out.println();

        // Single-level inheritance
        System.out.println("Single-level inheritance --> \n");
        B b = new B();
        b.a = 123;
        b.show();
        b.display();
        System.out.println();
    }
}
