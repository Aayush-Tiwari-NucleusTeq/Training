package Day_7.List;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class UpdateList {
    public static void main(String[] args) {
        System.out.println("Program illustrating updating elements in the list containing more than 50");
        List<Integer> integerlist = Arrays.asList(11,22,33,44,55,66);
        for (int i = 0; i < integerlist.size(); i++) {
            if(integerlist.get(i) >= 50){
                integerlist.set(i, integerlist.get(i) + 5);
            }
            System.out.print(integerlist.get(i) + " ");
        }
        
    }
}
