package Day2.Final_Keyword;

final class Demo{
    int i = 900;
    String s = "Aayush";

    void display(){
        System.out.println("The value of i is - " + i + " and value of s is - " + s);
    }
}

// class Demo2 extends Demo{ // Cannot extend Demo class 
// }

public class FinalClass {
    public static void main(String[] args) {
        System.out.println("Program illustrating use of final class");
        Demo ob = new Demo();
        ob.display();
    }
}
