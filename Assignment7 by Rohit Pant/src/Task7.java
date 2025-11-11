class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Task7 {

    static void validateEmail(String mail) throws InvalidEmailException {
        if (!mail.contains("@")) {
            throw new InvalidEmailException("Invalid Email: '@' is missing.");
        } else {
            System.out.println("Valid Email: " + mail);
        }
    }

    public static void main(String[] args) {
        try {
            validateEmail("samir.khan.com");
        } catch (InvalidEmailException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        }
    }
}
