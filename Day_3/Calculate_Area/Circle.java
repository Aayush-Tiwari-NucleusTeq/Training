package Day_3.Calculate_Area;

import java.util.Scanner;

/**
 * This program demonstrates an area of circle
 */
class SomethingWentWrongException extends Exception {  
    public SomethingWentWrongException(String errorMessage) {  
    super(errorMessage);  
    }  
}  

class CreateCircle{
    public static double pi = 3.14;
    public int radius;

   /**
    * Initializing radius with the constructor
    * @param radius
    * @throws SomethingWentWrongException
    */
    CreateCircle(int radius) throws SomethingWentWrongException{
     
        this.radius = radius;
    }

    double CircleArea(){
        return pi * radius * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        System.out.println("I am area of circle java program");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the radius");
            int radius = sc.nextInt();
            if(radius<0){
                throw new SomethingWentWrongException("Some error is occuring assigning radius check whether you are assigning correct value for radius or not");
            }
            CreateCircle circle = new CreateCircle(radius);
            System.out.println("The area of the given circle radius is -> " + circle.CircleArea());
        } catch (SomethingWentWrongException e) {
            e.printStackTrace();
        }
    }
}
