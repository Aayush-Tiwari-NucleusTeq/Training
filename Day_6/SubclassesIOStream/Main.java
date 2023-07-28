package SubclassesIOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program illustrating working with all the subclasses available in Input Output Stream in Java");

        // FileInputStream and FileOutputStream 
        FileInputStream fis = null;
        FileOutputStream fout = null;
        try {
            fis = new FileInputStream("D:\\Training\\Day_6\\SubclassesIOStream\\input.txt");
            fout = new FileOutputStream("D:\\Training\\Day_6\\SubclassesIOStream\\output.txt");
            int c;
            while ((c = fis.read()) != -1) {
                fout.write((byte)c); // Can use byte or char for writing into the file
            }

            System.out.println("File is successfully copied");
        } catch (Exception e) {
            System.out.println("Something went wrong !!");
        }

        // ByteArrayInputStream and ByteArrayOutputStream
        byte[] buff = {97,98,99,100};
        ByteArrayInputStream aris = new ByteArrayInputStream(buff);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("D:\\Training\\Day_6\\SubclassesIOStream\\buffer.txt");
        int i=0;
        while ((i = aris.read()) != -1) {
            baos.write(i);
            baos.writeTo(fos);
            // baos.writeTo(buffout);
            System.out.println("The ASCII value of " + i + " is : " + (char)i);
        }

    }
}
