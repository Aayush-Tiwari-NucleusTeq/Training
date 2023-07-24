package Day_3.Finally_Block;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name from which you want to read ");
        String source = sc.nextLine();
        String prefix = "D:\\Training\\Day_3\\Finally_Block\\";
        String suffix = ".txt";
        source = prefix + source + suffix;
        FileReader fr = null;
        try {
            fr = new FileReader(source);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
        } catch(FileNotFoundException e) {
            System.out.println("File not found in the given directory !!");
        } catch(IOException e){
            System.out.println("Some Input Output related exception is occurred !!");
        } catch(Exception e){
            System.out.println("Some error is occurred by your end !!");
        } finally{
            fr.close();
            sc.close();
            System.out.println("File is closed successfully");
        }
    }
}
