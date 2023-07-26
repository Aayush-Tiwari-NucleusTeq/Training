package Day_5.LambdaExpression;

import java.util.Scanner;

interface Demo{
    public String remove_Vowels(String str);
}

public class Expression {

    public static void main(String[] args) {
        System.out.println("Program illustrating lambda expression which removes vowels with # in a string");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text you want ");
        String str = sc.nextLine();
        Demo d = (value)->{
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'  || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    value = str.replace(str.charAt(i), '#');
                }
            }
            return value;
        };
        String value = d.remove_Vowels(str);
        System.out.println("The String after removal of vowels is -> " + value); 
        sc.close();
    }
}
