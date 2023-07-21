package Day1.Exercise_6;

public class Question_4 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating addition of two matrices");
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][] = new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans.length; j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
