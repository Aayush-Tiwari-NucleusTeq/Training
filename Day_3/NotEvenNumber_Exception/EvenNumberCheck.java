package Day_3.NotEvenNumber_Exception;

import java.util.Scanner;

public class EvenNumberCheck {
    public static void main(String[] args) {
        System.out.println("Program illustrating about the number is even or not");
        System.out.println("Enter any number to check whether is even or not");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        try {
            int number = Integer.parseInt(num);
            if(number%2 != 0){
                throw new NotEvenNumException("This number is not an even one , try with another no. !!");
            }
            else{
                System.out.println("The number is even !!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred !!");
            System.out.println("Check the value you entered first !!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
