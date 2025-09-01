import java.util.Scanner;
    public class BuyProduct {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Product #1 name: ");
            String productName1 = scanner.nextLine();
            System.out.print("product #1 price: ");
            double productPrice1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("product #2 name: ");
            String productName2 = scanner.nextLine(); 
            System.out.print("Product #2 price: ");
            double productPrice2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Product #3 name: ");
            String productName3 = scanner.nextLine();
            System.out.print("Product #3 price: ");
            double productPrice3 = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Customer paid money : ");
            double paid = scanner.nextDouble();
            
            System.out.println("----- receipt -----");
            System.out.println(productName1 +" : " +productPrice1 +"baht.");
            System.out.println(productName2 +" : " +productPrice2 +"baht.");
            System.out.println(productName3 +" : " +productPrice3 +"baht.");
            
            double total = productPrice1 + productPrice2 + productPrice3 ;
            System.out.println("Total price before tax: " +total +" baht.");
            
            double vat = total * 0.07;
            System.out.println("VAT = " +vat +" baht.");
            
            double net_price = total + vat;
            System.out.println("Net price : " +net_price +" baht.");

            System.out.println("Total paid " +paid +" baht.");

            double change = paid - net_price;
            System.out.println("Change = " +change +" baht.");
        }
    }