import java.util.Scanner ;
    public class Swapping {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int number1  = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int number2 = scanner.nextInt();
                
                System.out.println("Enter number 1 : " +number1);
                System.out.println("Enter number 2 : " +number2);
                System.out.println("Current -> number1 = " +number1 +" and number2 = " +number2);
                System.out.println(" Swapping ........ ");

                int number = number1;
                number1 = number2;
                number2 = number;

                System.out.println("Now -> number 1 = " +number1 +" and number2 = " +number2);
    }
}