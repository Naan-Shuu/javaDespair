import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("###,###.##");
        double discount, price; 
        int money; 
        System.out.println("Enter amount of purchases: ");
        money = scan.nextInt();
        if (money > 10) {
            discount = money * 0.10;
            price = money - discount;
            System.out.println("Discounted price: "+price);
        }
        else{
            System.out.println("Below discount range");
            System.out.println("Price: "+money);
        }
    }
}
