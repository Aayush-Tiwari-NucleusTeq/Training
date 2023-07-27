package ListOfDirectory;

import java.io.File;
import java.util.Scanner;

public class ShowFile {

    //  static void RecursivePrint(File[] arr, int level)
    // {
    //     // for-each loop for main directory files
    //     for (File f : arr) {
    //         // tabs for internal levels
    //         for (int i = 0; i < level; i++)
    //             System.out.print("\t");
 
    //         if (f.isFile())
    //             System.out.println(f.getName());
 
    //         else if (f.isDirectory()) {
    //             System.out.println("[" + f.getName() + "]");
 
    //             // recursion for sub-directories
    //             RecursivePrint(f.listFiles(), level + 1);
    //         }
    //     }
    // }
 
    public static void main(String[] args) {
        System.out.println("Program illustrating list all the files");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url you want to traverse and print : ");
        String url = sc.nextLine();

        File dirToPrint = new File(url);
        if(dirToPrint.exists() && dirToPrint.isDirectory()){
            File arrFiles[] = dirToPrint.listFiles();
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Files or the directories from the main directory you entered : " + dirToPrint);
            System.out.println("------------------------------------------------------------------------------------");
            // RecursivePrint(arrFiles, 0);
          for (File file : arrFiles) {
            System.out.println(file);
          }
        }

        sc.close();
    }
}
