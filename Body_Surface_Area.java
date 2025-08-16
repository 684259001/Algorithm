import java.util.Scanner;

public class Body_Surface_Area {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //weight
        System.out.print("Enter your weight in kilograms : ");
        float weight = scanner.nextFloat();

        //height
        System.out.print("Enter your height in meters : ");
        float height = scanner.nextFloat();

        //คำนวนขนาดพื้นที่ของผิวร่างกาย
        float Body = (weight * weight) / height;
        System.out.println("Body surface area is = " +Body );
    }
}