package Day_3.Calculate_Area;

import java.util.Scanner;

class SomethingWentWrongException extends Exception {  
    public SomethingWentWrongException(String errorMessage) {  
    super(errorMessage);  
    }  
}  

public class Triangle {
    public static void main(String[] args) {
        System.out.println("This is an example of area of triangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle -> ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle -> ");
        int height = sc.nextInt();
        try {
            if(base < 0 || height < 0){
                throw new SomethingWentWrongException("Something went wrong , try again");
            }
            int ans = (base * height) / 2;
            System.out.println("The area of the triangle with given base and height is -> " + ans); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }

    }
}
