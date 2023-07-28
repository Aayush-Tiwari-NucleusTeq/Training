package SubclassesIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Training\\Day_6\\SubclassesIOStream\\serializedobject.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp = null;
        emp = (Employee) ois.readObject();
        System.out.println(emp.name);
        ois.close();
    }
}
