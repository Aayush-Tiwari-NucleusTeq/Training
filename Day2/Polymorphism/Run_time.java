package Day2.Polymorphism;

class Calculator {
 
    public int Multiply(int a, int b)
    {

        return a * b;
    }
 
    // Overloading Multiply class (Compile-time Polymorphism)
    public double Multiply(double a, double b)
    {
        return a * b;
    }

    public void display()
    {
        System.out.println("I am print method of Calculator class");
    }
}

class Computer extends Calculator
{
    // Overriding the display method of calculator class (Run-time Polymorphism)
    public void display()
    {
        System.out.println("I am print method of computer class");
    } 
}

public class Run_time {
    public static void main(String[] args) {
        System.out.println("Program illustrating concept of Polymorphism");
        Calculator cal = new Calculator();
        // System.out.println("The muliplication of double values is " + cal.Multiply(2.5, 2.5));
        // System.out.println("The muliplication of integer values is " + cal.Multiply(2, 2));

        Calculator comp = new Computer();
        comp.display();
    }
}
