import java.util.Scanner;
public class TirePressure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte rFP, lFP, rRP, lRP;
        System.out.println("Input right front pressure:");
        rFP = scan.nextByte();
        System.out.println("Input left front pressure:");
        lFP = scan.nextByte();
        System.out.println("Input right rear pressure:");
        rRP = scan.nextByte();
        System.out.println("Input right rear pressure:");
        lRP = scan.nextByte();

        if(rFP == lFP && rRP >= lRP || lRP >= rRP)
            System.out.println("Inflation is OK!");
        else    
            System.out.println("Uneven tire pressure!");

    }
}
