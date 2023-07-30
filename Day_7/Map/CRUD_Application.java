package Day_7.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CRUD_Application {
    public static void main(String[] args) {
        System.out.println("Program illustrating implementation of employee task with map...");
        Map<Integer, String> empMap = new LinkedHashMap<>();
        empMap.put(11, "Aayu");
        empMap.put(12, "Rocky");

        Scanner sc = new Scanner(System.in);

        // Create
        System.out.println("Enter the id and name of the employee to add in the map - ");
        int id = sc.nextInt();
        String name = sc.next();
        empMap.put(id, name);
        System.out.println(empMap);

        // Read
        System.out.println();
        System.out.println("Enter an id to read it from the map - ");
        int key = sc.nextInt();
        String empName = empMap.get(key);
        if (empMap.containsKey(key)) {
            System.out.println("The employee with " + key + " id is : " + empName);
        } else {
            System.out.println("Key is not present in the given map");
        }

        // Update
        System.out.println();
        System.out.println("Enter an id to perform update task in the map - ");
        int ukey = sc.nextInt();
        if (empMap.containsKey(ukey)) {
            System.out.println("Enter new name : ");
            String newname = sc.next();
            empMap.put(ukey, newname);
        } else {
            System.out.println("Key is not present in the given map");
        }
        System.out.println("After updation the map is - > " + empMap);

        // Delete
        System.out.println();
        System.out.println("Enter an id to delete it from the map - ");
        int dkey = sc.nextInt();
        if (empMap.containsKey(ukey)) {
           empMap.remove(dkey);
        } else {
            System.out.println("Key is not present in the given map");
        }
        System.out.println("After deletion the map is - > " + empMap);

        sc.close();

    }
}
