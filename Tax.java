import java.util.Scanner;

    public class Tax {
        public static void main(String args[]) {
            //ใส่จำนวนรายได้ต่อเดือน
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your monthly income ");
            int mthly = scanner.nextInt();
            //ภาษ๊ 10%
            int tr = 10;
            //จำนวนภาษีที่พนักงานต้องชำระ
            int tax = mthly / tr;
            System.out.println("The tax you are required to pay is " +tax +" Baht.");
        }
    }