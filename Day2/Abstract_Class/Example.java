package Day2.Abstract_Class;

abstract class Car {
    void reverse() {
        System.out.println("Shifting gear to R");
    };
    abstract void forward();
}

class Civic extends Car {

    @Override
    void forward() {
        System.out.println("Shifting gear from neutral to first in Honda Civic");
    }

    void music(){
        System.out.println("Playing music in Honda Civic");
    }

    // @Override
    // void reverse() {
    //     System.out.println("Shifting gear to R of Honda Civic");
    // };
}

class Verna extends Car{

    @Override
    void forward() {
       System.out.println("Shifting gear from neutral to first in Hyundai Verna !!");
    }

    void brake(){
        System.out.println("Pressing brakes just now to stop the car");
    }

}

public class Example {
    public static void main(String[] args) {
        System.out.println("Program demonstrating use of Abstract class");
        Civic civic = new Civic();
        civic.reverse();
        civic.forward();
        civic.music();
        System.out.println();
        System.out.println();
        Verna verna = new Verna();
        verna.reverse();
        verna.forward();
        verna.brake();
    }
}
