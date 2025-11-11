import java.net.SocketOption;
import java.util.Scanner;

public class Task1{

    public static int sumNumbers(int n ){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }

        string

        return sum;
    }

    public static void multitable(int n ){
        System.out.println("\nThis is table of " + n);
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void factorial(int n){
        int fact = 1;

        for(int i = n; i > 0; i--){
            fact = fact * i;
            System.out.println(" \n" + fact);
        }
        System.out.println("the factorial of " + n + " is " + fact);
    }

    public static void reverseWithWhile(int n) {
        int argu = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = (ans * 10 )+ rem;
        }

        System.out.println("The reverse of " + argu + " is " + ans);
    }

    public static void main(String[] args) {
//        Task1
        System.out.print("Enter the number : ");
        Scanner sc1 = new Scanner(System.in);?
        int num = sc1.nextInt();
        int sum = sumNumbers(num);
        System.out.println("The sum of the digits of " + num + " is " + sum);

//        Task2
        multitable(num);

//        Task3
        factorial(num);

//        Task4
        reverseWithWhile(num);
    }
}