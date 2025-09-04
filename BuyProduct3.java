import java.util.Scanner;
    public class BuyProduct3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //รับค่าสินค้าชิ้นที่1
            System.out.print("Product #1 name: ");
            String productName1 = scanner.nextLine();
            System.out.print("product #1 price: ");
            double productPrice1 = scanner.nextDouble();
            System.out.print("Enter quantity for produuct 1 = ");
            double quantity_product1 = scanner.nextDouble();
            scanner.nextLine();
            //รับค่าสินค้าชิ้นที่2
            System.out.print("product #2 name: ");
            String productName2 = scanner.nextLine(); 
            System.out.print("Product #2 price: ");
            double productPrice2 = scanner.nextDouble();
            System.out.print("Enter quantity for produuct 2 = ");
            double quantity_product2 = scanner.nextDouble();
            scanner.nextLine();
            //รับค่าชิ้นค้าชิ้นที่3
            System.out.print("Product #3 name: ");
            String productName3 = scanner.nextLine();
            System.out.print("Product #3 price: ");
            double productPrice3 = scanner.nextDouble();
            System.out.print("Enter quantity for produuct 3 = ");
            double quantity_product3 = scanner.nextDouble();
            scanner.nextLine();
            //ใส่จำนวนเงินที่ได้รับมา
            System.out.print("Enter amount paid : ");
            double paid = scanner.nextDouble();
            
            System.out.println("----- receipt -----");
            //คำนวนราคาสินค้าแต่ละชิ้นที่ซื้อ
            double totalProduct1 = productPrice1 * quantity_product1 ;
            double totalProduct2 = productPrice2 * quantity_product2 ;
            double totalProduct3 = productPrice3 * quantity_product3 ;
            System.out.println(productName1 +" : " +productPrice1 +" x " +quantity_product1 +" = " +totalProduct1 +" baht.");
            System.out.println(productName2 +" : " +productPrice2 +" x " +quantity_product2 +" = " +totalProduct2 +" baht.");
            System.out.println(productName3 +" : " +productPrice3 +" x " +quantity_product3 +" = " +totalProduct3 +" baht.");
            //ราคารวมของสินค้าที่ซื้อ
            double subtotal = totalProduct1 + totalProduct2 + totalProduct3 ;
            System.out.println("Subtotal : " +subtotal );
            //คำนวนภาษี
            double vat = subtotal * 0.07;
            System.out.println("VAT = " +vat +" baht.");
            //ราคาสุทธิที่ต้องชำระ
            double totalIncludingVat =  subtotal + vat ;
            System.out.println("Total including VAT : " +totalIncludingVat +" Baht.");
            System.out.println("Amount paid : " +paid +" Baht. ");
            double change = subtotal - vat ;
            System.out.println("Change: " +change +" Baht. "); 
        }
    }