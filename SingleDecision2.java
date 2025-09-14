import java.util.Scanner ;
    public class SingleDecision2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("ระบุจำนวนเลข : ");
                int number = scanner.nextInt();
                if (number > 0) { 
                    System.out.println("จำนวนเต็มบวก ");
                }
                else {
                    System.out.println("ไม่ใช่จำนวนเต็มบวก");
                }
                System.out.println("จบโปรแกรม ");
                }
            }