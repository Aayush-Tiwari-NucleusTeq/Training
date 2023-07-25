package Day_4.Tasks;

public class ReverseList extends Thread{
    public int[] num;
    ReverseList(int[] num){
        this.num = num;
    }
    public void run(){
        System.out.println("The elements in the array in reverse order be like -> ");
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        // System.out.println("I am reverse list thread " + num.length);
    }
}
