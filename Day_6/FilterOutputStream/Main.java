package FilterOutputStream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MyFile extends FilterOutputStream {

    public MyFile(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte data[]) throws IOException {
        if(data != null){
            
        }
        super.write(data);
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Program illustrating use of FilerOutputStream class in java");
    }
}
