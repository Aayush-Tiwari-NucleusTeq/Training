package Day_3.InvalidPasswordException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {

    public static Boolean check_Password(String password) throws InvalidPasswordException {
        // System.out.println("The password given by you is - " + password);
        boolean flag = true;
        for (int i = 0; i < password.length(); i++) {
            if ((Character.isLetterOrDigit(password.charAt(i))) == false) {
                flag = false;
            }
        }
        if (password.length() > 8 || password.length() < 8)
            return false;
        return true;
    }

    public static Boolean check_Password_Regex(String password) throws InvalidPasswordException{
        // System.out.println("Your answer is - " + Pattern.matches("^[a-zA-Z0-9]{8,}",password));
        if(Pattern.matches("^[a-zA-Z0-9]{8,}",password)){
            return true;
        } else{
            throw new InvalidPasswordException("Password doesn't meet with the criteria");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password here : ");
        String password = sc.nextLine();

        /**
         * Password check with simple expressions
         */
        try {
            if (!check_Password(password)) {
                System.out.println("Password doesn't met with the criteria");
                sc.close();
                throw new InvalidPasswordException("Enter the correct password");
            } else {
                System.out.println("Congratulations , your password met with the criteria !!");
            }
            System.out.println();
        } catch (InvalidPasswordException e) {
            System.out.println("Your given password doesn't meet the criteria , so please try with another one !!");
            e.printStackTrace();
        }

        System.out.println();
        /**
         * Password check with the regular expression
         */
        try {
            if(check_Password_Regex(password))
                System.out.println("Your password met with the criteria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("An unexpected error occurred !!");
        }
    }
}
