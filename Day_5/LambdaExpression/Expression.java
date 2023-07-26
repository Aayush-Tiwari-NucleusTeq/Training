package Day_5.LambdaExpression;

import java.util.Scanner;

/**
 * Demo interface for resolving lambda expression
 */
interface Demo{
    public String remove_Vowels(String str);
}

public class Expression {

    public static void main(String[] args) {
        System.out.println("Program illustrating lambda expression which removes vowels with # in a string");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text you want ");
        String str = sc.nextLine();

        /**
         * Lambda expression
         */
        Demo d = (value)->{
                value = str.replaceAll("[aeiouAEIOU]", "#");
                return value;
        };
        String value = d.remove_Vowels(str);
        System.out.println("The String after removal of vowels is -> " + value); 
        sc.close();
    }
}
