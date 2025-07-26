import java.util.Scanner;

public class X_bar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //number1
        System.out.print("Please enter number1 = ");
        int num1 = scanner.nextInt();

        //number2
        System.out.print("Please enter number2 = ");
        int num2 = scanner.nextInt();

        //number3
        System.out.print("Please enter number3 = ");
        int num3 = scanner.nextInt();

        //number4
        System.out.print("Please enter number4 = ");
        int num4 = scanner.nextInt();

        //number5
        System.out.print("Please enter number5 = ");
        int num5 = scanner.nextInt();

        //sum
        int sum = num1 + num2 + num3 + num3 + num4 + num5;
        System.out.println("Sum = " +sum);

        //xbar
        int a = 5;
        int Xbar = sum / a;
        System.out.println("X-bar = " +Xbar);
    }
}