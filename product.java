import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product #1 name: ");
        String productName1 = scanner.nextLine();

        System.out.print("Product #1 price: ");
        double productPrice1 = scanner.nextDouble();

        System.out.print("Product #2 name: ");
        String productName2 = scanner.nextLine();

        System.out.print("Product #2 price: ");
        double productPrice2 = scanner.nextDouble();

        System.out.print("Product #3 name: ");
        String productName3 = scanner.nextLine();

        System.out.print("Product #3 price: ");
        double productPrice3 = scanner.nextDouble();

        System.out.print("Customer paid money : ");
        double paid = scanner.nextDouble();

        double total = productPrice1 + productPrice2 + productPrice3;

        double vat = total * 0.07;

        double netpay = total - vat;

        double change = paid - netpay;

        System.out.println(productName1+": "+productPrice1+" baht");
        System.out.println(productName2+": "+productPrice2+" baht");
        System.out.println(productName3+": "+productPrice3+" baht");
        System.out.println("Total price before tax: "+total+" baht");
        System.out.println("VAT = "+vat+" baht");
        System.out.println("Net Price "+netpay+" baht");
        System.out.println("Total paid "+paid+" baht");
        System.out.println("Change = "+change+" baht");

    }
}