import java.util.Scanner;
public class Total {
    public static void main(String[] args) {
        //ใส่ค่าที่1
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the number of boxes = ");
        int boxes = scanner.nextInt();
        //ใส่ค่าที่2
        System.out.print(" Enter the number of pencils = ");
        int pencils = scanner.nextInt();
        //ผลรวม
        int total = boxes * pencils;
        System.out.println("Total of = " +boxes +" and " +pencils +" = " +total);
    }
}