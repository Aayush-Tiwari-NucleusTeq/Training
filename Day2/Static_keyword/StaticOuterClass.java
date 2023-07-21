public class StaticOuterClass {

    private static String msg = "This is the private message";
    static class StaticClass{
        public void print(){
            System.out.println("The message is -> " + msg);
        }
    }
    public static void main(String[] args) {
        System.out.println("Program illustrating static class concept");
        StaticOuterClass.StaticClass obj = new StaticOuterClass.StaticClass();
        obj.print();
    }
}
