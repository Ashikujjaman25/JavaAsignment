package JavaAsignment;

public class Stringmeth {
    public static void main(String[] args) {
        // Create and initialize strings
        String firstName = "John";
        String lastName = "Doe";

        // Concatenation
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        // Length
        System.out.println("Full Name Length: " + fullName.length());

        // Substring
        System.out.println("Last Name: " + fullName.substring(5));

        // Replace
        String replacedName = fullName.replace("John", "Jane");
        System.out.println("Replaced Name: " + replacedName);

        // Uppercase and Lowercase
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
    }
}
