package Day_3.File_Read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program illustrating reading of file");
        try {
            System.out.println("Enter the file name you want to print");
            String name = sc.nextLine();
            FileReader fileReader = new FileReader("D:\\Training\\Day_3\\File_Read\\" + name + ".txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception block");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOExceptoin block");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
