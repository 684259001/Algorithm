import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        // ใส่ค่าจำนวนกล่อง
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter box = ");
        int box = scanner.nextInt();
        // ใส่ค่าดินสอต่อกล่อง
        System.out.print("Enter pencil = ");
        int pencil = scanner.nextInt();
        // ผลรวม
        int Sum = box * pencil;
    }
}