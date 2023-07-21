package Day2.Inheritance;

// Hierarchical Inheritance
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

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Hierarchical inheritance example");
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
