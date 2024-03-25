import java.util.Scanner;
public class InternetDelicatessen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item;
        byte del;
        double price, total = 0, delRate = 2.00;

        System.out.print("Enter the item:");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        System.out.print("Overnight delivery (0 == no, 1 == yes): ");
        del = scan.nextByte();

        if(del == 1 && price < 10){
            delRate += 3.00;
            total = price + delRate;
        }
        if(del == 0 && price < 10)
            total = price + delRate;
        if(del == 1 && price >= 10){
            delRate = 3.00;
            total = price + delRate;
        }
        if(del == 0 && price >= 10){
            delRate = 0.00;
            total = price;
        }

        System.out.println("Invoice:");
        System.out.println("\t"+item+"\t\t"+price);
        System.out.println("\tDelivery"+"\t"+delRate);
        System.out.println("\tTotal"+"\t\t"+total);
    }
}
