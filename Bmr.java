import java.util.Scanner ;
    public class Bmr {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //char
            System.out.print("Enter your sex (man / female): "); 
            char sex = scanner.next().charAt(0);
            if(sex == 'm'){
                System.out.print("Enter your weight in kilograms: ");
                double weight = scanner.nextDouble();
                System.out.print("Enter your height in  centimeter: ");
                double height = scanner.nextDouble();
                System.out.print("Enter your age: ");
                int years = scanner.nextInt();
                double bmr_m = 66 + (13.7 * weight) + (5 * height) - (6.8 * years);
                System.out.println("Your BMR is:" +bmr_m);
            }
            else {
                System.out.print("Enter your weight in kilograms: ");
                double weight = scanner.nextDouble();
                System.out.print("Enter your height in  centimeter: ");
                double height = scanner.nextDouble();
                System.out.print("Enter your age: ");
                int years = scanner.nextInt();
                double bmr_f = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * years);
                System.out.println("Your BMR is:" +bmr_f);
            }

        }
    }