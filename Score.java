import java.util.Scanner ;
    public class Score {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your midtrem score: ");
                int midterm = scanner.nextInt();
                System.out.print("Enter your final score: ");
                int finalterm = scanner.nextInt();
                int sum = midterm + finalterm;
                
                if ( sum >= 50 ) {
                    System.out.println("Your total score is " +sum +" . The result is Pass !!");
                }else{
                    System.out.println("Your total score is " +sum +" . The result is Fail !!");
                }
            }
    }