package Day_3.Invalid_Input_Exception;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Program relating ATM Works, powered by NucleusTeq bank");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit -> ");
        int amountdeposit = sc.nextInt();
         System.out.print("Enter the amount to deposit -> ");
        int amountwithdraw = sc.nextInt();
        try {
            if(amountwithdraw < 0 || amountwithdraw > amountdeposit){
                throw new InvalidInputException("Enter correct amount to withdraw your money!!");
            }
            System.out.println("Money is getting withdrawn ...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
