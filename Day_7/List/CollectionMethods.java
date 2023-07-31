package Day_7.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        System.out.println("Program illustrating clear method in Collection interface");
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            // add() method
            mylist.add(i, (i+1)*2);
        }

        System.out.println("\nSize of the list is : " + mylist.size());
        System.out.println("\nFollowing are the numbers list has -> ");
        for (Integer number : mylist) {
            System.out.print(number + " ");
        }

        // clear() method
        mylist.clear(); // It will clear all the elements from the list and make the list empty
        System.out.println("\n\nThe size of the above list is : " + mylist.size());
        if(mylist.isEmpty()){
            System.out.println("Yes the list is empty");
        }else{
            System.out.println("List has elements");
        }
        // System.out.println(mylist.get(0));


        List<Integer> mylist2 = Arrays.asList(1,2,3,4,55,66,77);
        // addAll() method
        mylist.addAll(mylist2);
        System.out.println("\nThe size of mylist after addAll method is : " + mylist.size());

        // remove() method
        mylist.remove(6);
        System.out.println("\nElements after removing the element from 6th index are - " + mylist);

        // removeAll() method
        mylist.add(5);
        mylist.add(50);
        mylist.add(32);
        mylist.removeAll(mylist2);
        System.out.println("\nElements after removeAll method are - " + mylist);

    }
}
