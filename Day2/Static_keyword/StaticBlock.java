public class StaticBlock {

    static{
        System.out.println("I am before main method");
    }

    int i=100;
    static int j=500;
    
    public static void main(String[] args) {
        System.out.println("I am under main method")    ;
        System.out.println("The value of j is " + StaticBlock.j);
        StaticBlock obj = new StaticBlock();
        System.out.println("The value of i is " + obj.i);
    }
}