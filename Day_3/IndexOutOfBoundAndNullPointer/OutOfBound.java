package Day_3.IndexOutOfBoundAndNullPointer;

import java.util.Scanner;

class IndexOutOfBoundOrNullPointerException extends Exception{
    IndexOutOfBoundOrNullPointerException(String message){
        super(message);
    }
}

public class OutOfBound {
    public static void main(String[] args) throws IndexOutOfBoundOrNullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here : ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("Your entered content is " + str);
        System.out.println();
        System.out.println("Now , Enter the index you want to get an element");
        int index = sc.nextInt();
        try {
            char ch = str.charAt(index);
            System.out.println("According to your given index the element is - " + ch);
        } catch (Exception e) {
            throw new IndexOutOfBoundOrNullPointerException("The index you gave is out of bound or null , so please check twice and fill again !!");
        }
        finally{
            sc.close();
        }
        }
}
