public class My_Ex_Class extends Exception {
    public My_Ex_Class(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            // Example usage
            validateString("HelloWorld"); // This will throw My_Ex_Class with the message "String too large"
        } catch (My_Ex_Class e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void validateString(String input) throws My_Ex_Class {
        if (input.length() > 10) {
            throw new My_Ex_Class("String too large");
        } else {
            System.out.println("Valid string: " + input);
        }
    }
}
