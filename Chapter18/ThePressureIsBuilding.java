import java.util.Scanner;
public class ThePressureIsBuilding {
    public static void main(String[] args) {
        boolean goodPressure = true;
        Scanner scan = new Scanner(System.in);
        byte rFP, lFP, rRP, lRP;
        System.out.println("Input right front pressure:");
        rFP = scan.nextByte();
        if(rFP < 35 || rFP > 45){
            System.out.println("Warning: Pressure is out of range!");
            goodPressure = false;
        }
        System.out.println("Input left front pressure:");
        lFP = scan.nextByte();
        if(lFP < 35 || lFP > 45){
            System.out.println("Warning: Pressure is out of range!");
            goodPressure = false;
        }
        System.out.println("Input right rear pressure:");
        rRP = scan.nextByte();
        if(rRP < 35 || rRP > 45){
            System.out.println("Warning: Pressure is out of range!");
            goodPressure = false;
        }
        System.out.println("Input right rear pressure:");
        lRP = scan.nextByte();
        if(lRP < 35 || lRP > 45){
            System.out.println("Warning: Pressure is out of range!");
            goodPressure = false;
        }
        
        if(rFP <= (lFP + 3)|| rFP >= (lFP - 3))
            System.out.println("Inflation is OK");
        else if(goodPressure == false)
            System.out.println("Inflation is BAD");

    }
}

