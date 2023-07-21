package Day2.Final_Keyword;

class Demo{
    final int i;
    final int j=900;

    Demo(int i){
        this.i = i;
    }

    void display(){
        System.out.println("The value of i is -> " + i);
    }
}

public class FinalBlankVariable {
    public static void main(String[] args) {
        System.out.println("Program illustrating initializing final blank variable ");
        Demo ob = new Demo(123);
        // ob.i = 900; // Cannot do this because i is final variable
        ob.display();
    }
}
