package Day2.Nested_Class;

public class Member_Inner_Class {

    private int a = 300;

    class Inner {
        void msg() {
            System.out.println("The value of variable a is - " + a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Program demonsrtating member inner class");
        // Inner inner = new Inner();
        Member_Inner_Class obj = new Member_Inner_Class();
        Inner inner = obj.new Inner();
        inner.msg();
    }
}
