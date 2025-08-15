import java.util.Scanner;

public class Celsius{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Fahrenheit= ");
        float fahrenheit = scanner.nextFloat();
        float x = fahrenheit-32;
        float celsius = (x * 5) /9;
        System.out.println("Celsius = " +celsius);
    }
}