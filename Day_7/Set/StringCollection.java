package Day_7.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringCollection {
    public static void main(String[] args) {
        System.out.println("Program illustrating string collection");
        Set<String> mySet = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            mySet.add(str);
        }
        System.out.println("The size of the set is " + mySet.size());
        for (String value : mySet) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}