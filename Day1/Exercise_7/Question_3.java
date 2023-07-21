package Day1.Exercise_7;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Program demonstrating 5 more string methods");
        String str1 = "           Aayush Tiwari";
        String str2 = "aayush tIwari";
        System.out.println("compareTo " + str1.equals(str2));
        System.out.println("equalsIgnoreCase " + str1.equalsIgnoreCase(str2));
        System.out.println("Substring " + str1.contains("Aayu"));
        System.out.println("Trim " + str1.trim());
        String[] result = str1.split(" ");
        for(String str : result)
        {
            System.out.print(str + ",");
        }
    }
}
