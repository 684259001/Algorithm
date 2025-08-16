import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //รับค่าน้ำหนัก
        System.out.print("Enter your weight in kilograms : ");
        double weight = scanner.nextDouble();

        //รับค่าส่วนสูง
        System.out.print("Enter your height in maters : ");
        double height = scanner.nextDouble();

        //คำนวนค่าBmi
        double BMI = weight / (height * height);
        System.out.println("Your BMI for weight = " +weight +" kg. " +"and height = " +height +" maters " +"is : " +BMI +" bmi. ");
    }
}