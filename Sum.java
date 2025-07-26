import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        // ใส่ค่าที่1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        int number1 = scanner.nextInt();
        // ใส่ค่าที่2
        System.out.print("Enter number2 = ");
        int number2 = scanner.nextInt();
        // ผลรวม
        int sum = number1 + number2;
        System.out.println("Sum of = " + number1 + "  and " + number2 + " = " + sum);
    }
}