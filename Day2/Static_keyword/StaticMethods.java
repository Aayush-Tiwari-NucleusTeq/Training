public class StaticMethods {

    int i;
    static int j=1000;

    public static void method1(){
        System.out.println("Hey I am static method 1");
        // i=100; // We cannot do that because static method can only work on static variables
        System.out.println("The value of j is " + j);
        StaticMethods obj = new StaticMethods();
        obj.method2();
    }

    public void method2(){
        System.out.println();
        System.out.println("Hey I am simple method");
        i = 900; // We can do it because it is not a static method
        System.out.println("The value of i is " + i);
    }

    public static void main(String[] args) {
        System.out.println("Program illustrating static methods");
        method1();
        StaticMethods obj = new StaticMethods();
        // obj.method2();
    }
}
