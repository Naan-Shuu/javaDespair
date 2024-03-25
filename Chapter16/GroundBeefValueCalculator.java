import java.util.Scanner;
public class GroundBeefValueCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short leanA, leanB;
        double priceA, priceB;
        System.out.println("Price per pound package A");
        priceA = scan.nextDouble();
        System.out.println("Price per lean package A:");
        leanA = scan.nextShort();
        System.out.println("Price per pound package B");
        priceB = scan.nextDouble();
        System.out.println("Price per lean package B:");
        leanB = scan.nextShort();

        
    }
}
