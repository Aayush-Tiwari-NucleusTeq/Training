package Day2.Nested_Class;

public class Local_Inner_Class {

    private int data = 30;// instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println("The value of the data variable is -> " + data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        System.out.println("Program illustrating example of local inner class");
        Local_Inner_Class obj = new Local_Inner_Class();
        obj.display();
    }
}
