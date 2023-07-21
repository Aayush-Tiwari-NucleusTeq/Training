package Day2.Inheritance;

// Multiple inheritance through interfaces
interface I1
{
    public abstract void execute1();
}
interface I2
{
    public abstract void execute2();
}
class C implements I1,I2
{
    public void execute1()
    {
        System.out.println("I am from execute1");
    }
    public void execute2()
    {
        System.out.println("I am from execute2");
    }
}

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Multiple inheritance through interfaces");
        C c = new C();
        c.execute1();
        c.execute2();
    }
}
