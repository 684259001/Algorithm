import java.util.Scanner ;
    public class calMerchant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the price of product (per until) :");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity of the product : ");
            double quantity = scanner.nextDouble();
            if (quantity > 10) {
                double total_price = price * quantity;
                double total_sale = total_price * 0.1;
                double total = total_price - total_sale;
                System.out.println("You get a 10% discount! ");
                System.out.println("Total price : " +total +" bath.");
            }
            else {
                double total_price = price * quantity;
                System.out.println("Total price : " +total_price +" bath.");
            }
        }
    }
