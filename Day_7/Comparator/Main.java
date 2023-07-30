package Day_7.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program illustrating implementation of Comparator inerface...");
        ArrayList<Student> stlist = new ArrayList<>();
        stlist.add(new Student(134, "Zack", 45));
        stlist.add(new Student(134, "Aayush", 45));
        stlist.add(new Student(14, "Sunny", 45));
        stlist.add(new Student(134, "Dev", 45));
        stlist.add(new Student(134, "Virat", 45));

        Collections.sort(stlist, new SortByName());

        for (Student student : stlist) {
            System.out.println("Student id is : " + student.stId + " and the name is : " + student.name);
        }
    }
}
