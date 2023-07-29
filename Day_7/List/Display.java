package Day_7.List;

import java.util.Arrays;
import java.util.List;

public class Display {
    public static void main(String[] args) {
        System.out.println("Program illustrating diplay list elements less than 60");
        List<Integer> integerlist = Arrays.asList(1,2,3,4,90,100,12,11,13);
        for (int i = 0; i < integerlist.size(); i++) {
            if(integerlist.get(i) >= 60){
                continue;
            }
            System.out.print(integerlist.get(i) + " ");
        }
    }
}
