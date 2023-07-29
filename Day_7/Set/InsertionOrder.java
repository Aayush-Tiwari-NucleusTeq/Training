package Day_7.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InsertionOrder {
    public static void main(String[] args) {
        System.out.println("Program illustrating insertion order in set");

        Set<Integer> mySet = new HashSet<>();
        mySet.add(11);
        mySet.add(123);
        mySet.add(1);
        System.out.println();
        System.out.println("Without insertion order");
        System.out.println(mySet);

        Set<Integer> myNewSet = new LinkedHashSet<>();
        myNewSet.add(11);
        myNewSet.add(123);
        myNewSet.add(13);
        System.out.println();
        System.out.println("With insertion order");
        System.out.println(myNewSet);

    }
}
