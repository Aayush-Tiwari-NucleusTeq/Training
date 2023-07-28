package SubclassesIOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileOutputStream fout = new FileOutputStream("D:\\Training\\Day_6\\SubclassesIOStream\\serializedobject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        Employee emp = new Employee(1,"Aayush","Indore");
        oos.writeObject(emp);
        oos.close();
    }
}
