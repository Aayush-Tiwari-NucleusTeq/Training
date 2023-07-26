package Day_5.FunctionalInterface;

@FunctionalInterface
interface Shape{
    public double area();
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Program illustrating use of lambda expression with functional interface");
        final double PI = 3.14;
        Shape circle = ()->{
            return PI * 8 * 8;
        };
        Shape rectangle = ()->{
            return 8 * 4;
        };
        Shape square = ()->{
            return 8 * 8;
        };
        Shape cube = ()->{
            return 6 * 8 * 8;
        };
        Shape sphere = ()->{
            return 4 * PI * 8 * 8;
        };
        Shape cylinder = ()->{
            return 2 * PI * 8 * (8 + 12);
        };

        var circle_area = circle.area();
        var rectangle_area = rectangle.area();
        var square_area = square.area();
        var cube_area = cube.area();
        var sphere_area = sphere.area();
        var cylinder_area = cylinder.area();

        System.out.println("The area of circle is -> " + circle_area);
        System.out.println("The area of rectangle is -> " + rectangle_area);
        System.out.println("The area of square is -> " + square_area);
        System.out.println("The area of cube is -> " + cube_area);
        System.out.println("The area of sphere is -> " + sphere_area);
        System.out.println("The area of cylinder is -> " + cylinder_area);

    }
}
