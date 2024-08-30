 
package JavaAsignment;

 public class Stringmeth{
    public static void main(String[] args) {
        // Create and initialize strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        
        // Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenation: " + concatStr);

        // Comparison
        boolean isEqual = str1.equals(str3);
        System.out.println("Are 'str1' and 'str3' equal? " + isEqual);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Are 'str1' and 'str3' equal (ignoring case)? " + isEqualIgnoreCase);

        // Length
        int length = concatStr.length();
        System.out.println("Length of concatenated string: " + length);

        // Substring
        String subStr = concatStr.substring(6, 11); // "World"
        System.out.println("Substring (index 6 to 11): " + subStr);

        // Replace
        String replacedStr = concatStr.replace("World", "Java");
        System.out.println("After replacement: " + replacedStr);

        // Conversion to uppercase
        String upperCaseStr = concatStr.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // Conversion to lowercase
        String lowerCaseStr = concatStr.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        // Trim whitespace
        String paddedStr = "  Trim me!  ";
        String trimmedStr = paddedStr.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
    }
}