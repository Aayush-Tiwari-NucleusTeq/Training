package Day_7.Comparator;

import java.util.Comparator;

public class Student {
    int stId;
    String name;
    int age;

    Student(int stId,String name,int age){
        this.stId = stId;
        this.name = name;
        this.age = age;
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student obj1,Student obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}
