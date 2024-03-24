class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            validate(17);
        } catch (MyCustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void validate(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }
}
