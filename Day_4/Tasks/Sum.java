package Day_4.Tasks;

public class Sum extends Thread{
    int[] num;
    Sum(int[] num){
        this.num = num;
    }
    public void run(){
        int sum = 0;
        System.out.println("The sum of all elements present in an array is -> ");
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("The sum is = " + sum);
        // System.out.println("I am Sum thread " + num);
    }
}
