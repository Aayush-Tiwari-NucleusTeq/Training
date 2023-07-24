package Day_3.IndexOutOfBoundAndNullPointer;

import java.util.Scanner;

class IndexOutOfBoundOrNullPointerException extends Exception{
    IndexOutOfBoundOrNullPointerException(String message){
        super(message);
    }
}

public class OutOfBoundArray {
    public static void main(String[] args) throws IndexOutOfBoundOrNullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array - ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.println("Enter " + (i+1) + " element - ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the index you want to get the element from an array - ");
        int index = sc.nextInt();

        try {
            int value = arr[index];
            System.out.println("The value at " + index + "th index is -> " + value);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IndexOutOfBoundOrNullPointerException("Enter the correct index for the value from an array");
        } finally{
            sc.close();
        }
    }
}
