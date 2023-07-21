package Day1.Exercise_6;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating average from an array");
        int arr[] = {1,2,3,4,5,6};
        double sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        double ans = sum / arr.length;
        System.out.println("The average of an array is -> " + ans);
    }
}
