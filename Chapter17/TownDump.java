import java.util.Scanner;
public class TownDump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int charge = 0, tempCharge = 20, trash;
        System.out.println("What is the weight of your trash?(In pounds)");
        trash = scan.nextInt();

        if(trash > 200){
            charge = tempCharge + (8 * ((trash - 200)/100));
            System.out.println("Pay $"+charge+" to dispose your trash.");
        }
        else
            System.out.println("Pay $"+tempCharge+" to dispose your trash.");
    }
}
