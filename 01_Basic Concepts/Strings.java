public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // Length of string
        int length = concat.length();
        System.out.println("Length of String: " + length);

        // Substring
        String substring = concat.substring(6);
        System.out.println("Substring from index 6: " + substring);

        // Character at index
        char charAtIndex = concat.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);
    }
}
