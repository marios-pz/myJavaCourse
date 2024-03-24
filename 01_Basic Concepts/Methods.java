public class Methods {
    // Method with parameters and return type
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with no parameters and return type
    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        // Calling methods
        int sum1 = add(5, 3);
        System.out.println("Sum (int): " + sum1);

        double sum2 = add(5.5, 3.5);
        System.out.println("Sum (double): " + sum2);

        greet();
    }
}
