import java.util.Scanner;

public class Task2 {

    public static void Calculator(int n1, int n2, char opr) {
        switch (opr) {
            case '+':
                System.out.println("Addition of these number is : " + (n1 + n2));
                break;

            case '-':
                System.out.println("Subtarction of these number is : " + (n1 - n2));
                break;


            case '*':
                System.out.println("Multiplication of these number is : " + (n1 * n2));
                break;


            case '/':
                System.out.println("Division of these number is : " + (n1 / n2));
                break;


            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void main(String[] args) {

//        Task1
        System.out.print("Enter 2 separate numbers and desired operator (One of + , - , * , /) : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        char opt = sc.next().charAt(0);
        Calculator(num1, num2, opt);

//        Task 2
        
    }
}