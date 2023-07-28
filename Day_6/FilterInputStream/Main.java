package FilterInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class MyFile extends FilterInputStream {

    public MyFile(InputStream file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException{
        int data = super.read();
        if(data != -1){
            return data * 2;
        }
        return data;
    }
    
}

public class Main{
    public static void main(String[] args) throws IOException{
        System.out.println("Program illustrating filter output stream in java");
        FileInputStream fis = new FileInputStream("D:\\Training\\Day_6\\FilterInputStream\\example.txt");
        MyFile myFile = new MyFile(fis);
        int i;
        while ((i = myFile.read())!=-1) {
            System.out.print((char)i);
        }
        myFile.close();
    }
}
