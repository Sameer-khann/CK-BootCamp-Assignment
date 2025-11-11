public class Task6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled again in main(): " + e);
        }

        System.out.println("Program ended normally.");
    }

    static void method1() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught in method1(): Division by zero.");
            throw e;
        }
    }
}
