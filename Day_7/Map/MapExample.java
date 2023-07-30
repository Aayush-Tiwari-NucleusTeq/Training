package Day_7.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program illustrating check whether map contains key or value...");
        System.out.println();
        Map<Integer, String> myMap = new HashMap<>();
        System.out.println("Printing map : ");
        System.out.println();
        myMap.put(123, "First");
        myMap.put(67, "Pehla");
        myMap.put(78, "Dusra");
        myMap.put(123, "Second");
        myMap.put(11223, "Teesra");
        myMap.put(90, "Last");

        for (Map.Entry<Integer, String> obj : myMap.entrySet()) {
            System.out.println(obj.getKey() + " " + obj.getValue());
        }

        System.out.println();
        System.out.println("Enter the key to check whether it is present or not");
        int key = sc.nextInt();

        if (myMap.containsKey(key)) {
            System.out.println("The key " + key + " is present");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println();
        // System.out.println("Enter the value to check whether it is present or not");
        // String value = sc.nextLine();

        if (myMap.containsValue("Tees")) {
            System.out.println("The value is present");
        } else {
            System.out.println("Value is not present in the map");
        }

        System.out.println("Enter the key to delete from the map");
        int dkey = sc.nextInt();
        myMap.remove(dkey);
        System.out.println(myMap);

        sc.close();
    }
}
