package Day_3.File_Copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void copy_Content(File a, File b) throws IOException {
        FileReader fr = new FileReader(a);
        FileWriter fw = new FileWriter(b,true);
        int c;
        try {
            System.out.println("The content of the source file is like given :-> ");
            while ((c = fr.read()) != -1) {
                System.out.print((char)c);
                fw.write(c);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            fr.close();
            fw.close();
        }
        System.out.println("File is copied from " + a + " to " + b);
    }

    public static void main(String[] args) throws IOException{
        System.out.println("Program illustrating copy content of a file to another one");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name from which you want to copy all the content");
        String source = sc.next();
        System.out.println("Enter the file name from which you want to copy all the content");
        String destination = sc.next();
        String prefix = "D:\\Training\\Day_3\\File_Copy\\";
        String suffix = ".txt";
        source = prefix + source + suffix;
        destination = prefix + destination + suffix;
        try {
            File sfile = new File(source);
            File dfile = new File(destination);
            copy_Content(sfile,dfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
