// WAP to demonstrate some in-built functions on Strings
public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Replace: " + str.replace("World", "Java"));
        System.out.println("Substring: " + str.substring(6));
    }
}
