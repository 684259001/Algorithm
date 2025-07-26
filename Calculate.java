import java.util.Scanner;

public class Calculate {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        //base
        System.out.print("Please enter base = ");
        int base = scanner.nextInt();

        //heigh
        System.out.print("Please enter heigh = ");
        int heigh = scanner.nextInt();

        //side
        System.out.print("Please enter side = ");
        int side = scanner.nextInt();

        //Triangle
        int triangle =   base * heigh / 2;
        int square = side * side;
        System.out.println("Area of triangle = " +triangle +" and " +"are of square = " +square);
    }
}