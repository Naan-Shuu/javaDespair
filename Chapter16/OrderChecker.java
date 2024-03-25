import java.util.Scanner;
import java.text.DecimalFormat;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int washer, bolt, nut, cost, nutAmt, boltAmt, washerAmt;
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        System.out.print("Number of bolts: ");
        bolt = scan.nextInt();
        System.out.print("Number of nuts: ");
        nut = scan.nextInt();
        System.out.print("Number of washers: ");
        washer = scan.nextInt();             

        if(bolt == nut|| washer > (2*bolt))
            System.out.println("Order is OK.");
        if(nut < bolt)
            System.out.println("Check the Order: too few nuts.");
        if(bolt < nut)
            System.out.println("Check the Order: too few bolts.");
        if(washer < (2*bolt))
            System.out.println("Check the Order: too few washers.");

        boltAmt = bolt * boltPrice;
        washerAmt = washer * washerPrice;
        nutAmt = nut * nutPrice;
        cost = boltAmt + washerAmt + nutAmt;
        System.out.println("Total cost: "+cost);
        
    }
}
