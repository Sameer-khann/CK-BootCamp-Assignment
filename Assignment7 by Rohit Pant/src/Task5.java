//class DivisionwithException {
//    int num1, num2;
//
//    DivisionwithException(int num1, int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//
//    public void errorcheck() {
//        try {
//            int division = num1 / num2;
//            System.out.println("Division : " + division);
//            System.out.println("The numbers are divisible.");
//        } catch (ArithmeticException e) {
//            System.out.println("The numbers are not divisible.");
//        } finally {
//            System.out.println("Division completed");
//        }
//    }
//}

class Nestedtrycatch {
    Nestedtrycatch() {
        try {
            int[] nums = new int[3];
            int val1 = nums[8];

            try {
                int val2 = 20 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Invalid value.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Trying to access outer index.");
        }

    }
}

class ExceptionPropagationExample {

    public static void m1() {
        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in m1(): " + e);
        }
        System.out.println("m1() completed.");
    }

    public static void m2() {
        m3();
        System.out.println("m2() completed.");
    }

    // Method 3 — throws ArithmeticException
    public static void m3() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

//    public static void main(String[] args) {
//        m1();
//        System.out.println("Program ended normally.");
//    }
}


public class Task5 {
    public static void main(String[] args) {

//        DivisionwithException obj1 = new DivisionwithException(4, 6);
//        obj1.errorcheck();

//        Nestedtrycatch obj2 = new Nestedtrycatch();

        ExceptionPropagationExample.m1();
        System.out.println("ExceptionPropagationExample's program ended.");

    }
}


