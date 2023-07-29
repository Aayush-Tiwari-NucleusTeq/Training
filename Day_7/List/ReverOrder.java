package Day_7.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverOrder {
    public static void main(String[] args) {
        System.out.println("Program illustrating printing list elements in reverse order without for loop");
        List<Integer> mylist = Arrays.asList(1,2,3,4,45);
        ListIterator<Integer> iterator = mylist.listIterator(mylist.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
       
    }
}
