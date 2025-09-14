import java.util.Scanner ;
    public class ifShape {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter number 1 or 2");
                int choice = scanner.nextInt();

                if ( choice == 1 ) {
                    System.out.print("Please enter height of the tringle = ");
                    double heightTringle = scanner.nextDouble();
                    System.out.print("Please enter base of the tringle = ");
                    double base = scanner.nextDouble();
                    double area = base * heightTringle / 2 ;
                    System.out.println("Are of the tringle: " +area +"square units.");
                }

                else if ( choice == 2) {
                    System.out.print("Enter your weight in kilograms : ");
                    double weight = scanner.nextDouble();
                    System.out.print("Enter your height in maters : ");
                    double height = scanner.nextDouble();
                    double BMI = weight / (height * height);
                    System.out.println("Your BMI for weight = " +weight +" kg. " +"and height = " +height +" maters " +"is : " +BMI +" bmi. ");
                }
            }
    }