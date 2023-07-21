package Day2.Inheritance;

// ----------------------------------------| Multi-level inheritance |----------------------------------------
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Pug extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

public class Multi_level {
    public static void main(String[] args) {
        // Multi-level inheritance
        System.out.println("Multi-level inheritance --> \n");
        Pug p = new Pug();
        p.bark();
        p.eat();
        p.weep();
    }
}
