public class StaticBlock {

    static{
        System.out.println("I am before main method");
    }

    public static void main(String[] args) {
        System.out.println("I am under main method");
    }
}