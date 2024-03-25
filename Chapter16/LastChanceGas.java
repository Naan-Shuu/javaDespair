import java.util.Scanner;
public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tank, gauge, distance, mpg;
        System.out.println("Tank capacity:");
        tank = scan.nextInt();
        System.out.println("Gauge reading:");
        gauge = scan.nextInt();
        System.out.println("Miles per gallon:");
        mpg = scan.nextInt();

        distance = ((gauge / 100) * tank) * mpg;
        if(distance < 200)
            System.out.println("Get Gas!");
        else
            System.out.println("Safe to proceed");
    }
}
