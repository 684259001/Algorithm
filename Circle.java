import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
    final double PI = 3.14159;
   //enter radius
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter radius");
    int radius = scanner.nextInt();
    //total
    int area = (int)(PI*radius*radius);
    
    System.out.println("Area of a circle = " +area +" square centimeter.");
    }
}