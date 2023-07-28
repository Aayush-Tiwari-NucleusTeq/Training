package InvertFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program illustrating invert the content of the file and save it to the another one ...");
        FileReader fis = null;
        FileWriter ffile = null;
        Scanner sc = null;

        try {

            fis = new FileReader("D:\\Training\\Day_6\\InvertFile\\first.txt");
            ffile = new FileWriter("D:\\Training\\Day_6\\InvertFile\\second.txt");

            sc = new Scanner(fis);
            List<String> finalList = new ArrayList<String>();

            // Copying the content in the list
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                finalList.add(line);
            }

            ListIterator<String> iterator = finalList.listIterator(finalList.size());

            // Writing the content in the reverse order
            while (iterator.hasPrevious()) {
                ffile.write(iterator.previous());
                ffile.write("\n");
            }
            
            System.out.println("File content is successfully copied in a reverse order");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Something went wrong ...");
        } finally {
            sc.close();
            fis.close();
            ffile.close();
        }
    }
}
