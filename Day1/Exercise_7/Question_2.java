package Day1.Exercise_7;

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating string operations");
        String str = "Aayush Tiwari";
        System.out.println("String length -> " + str.length());
        System.out.println("String concatenation -> " + (str + " NT"));
        System.out.println("Character at given position -> " + str.charAt(3));
        System.out.println("Check if starts with A or not -> " + str.startsWith("a"));
        System.out.println("Find index of y -> " + str.indexOf('u'));
        System.out.println("Replace u with t -> " + str.replace('h', 't'));
    }
}
