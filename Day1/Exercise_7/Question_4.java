package Day1.Exercise_7;

public class Question_4 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating equals method and == operator");
        String str1 = "Aayush",str2 = "Aayush";

    String str3=new String("Aayush");
        System.out.println("Equals method " + str1.equals(str2));
        System.out.println("== operator " + (str1 == str2));
        System.out.println();
        System.out.println("Equals method " + str1.equals(str3));
        System.out.println("== operator " + (str1 == str3));
    }
}
