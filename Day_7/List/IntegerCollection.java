package Day_7.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerCollection {
    public static void main(String[] args) {
        System.out.println("Program illustrating creating integer collection of size 20 ");
        Scanner sc = new Scanner(System.in);
        List<Integer> integerlist = new ArrayList<Integer>(20);
        System.out.println("Enter the nubmers in list : ");
        for (int i = 0; i < 20; i++) {
            int value = sc.nextInt();
            integerlist.add(value);
        }
        System.out.println("Following are the numbers in the list you entered : ");
        for (int i = 0; i < integerlist.size(); i++) {
            System.out.print(integerlist.get(i ) + " ");
        }
        sc.close();
    }
}
