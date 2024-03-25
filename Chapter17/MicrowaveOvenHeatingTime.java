import java.util.Scanner;

public class MicrowaveOvenHeatingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int item, time, min, sec, tempSec = 0;

        System.out.print("How many items to heat: ");
        item = scan.nextInt();
        System.out.print("Time for one item: ");
        time = scan.nextInt();

        if(item == 1)
            tempSec = time;
        else if(item == 2){
            tempSec = time/2;
            tempSec += time;
        }
        else if(item == 3){
            tempSec = time * 2;
            tempSec += time;
        }
        else
            System.out.println("ERROR, NO ITEM INPUT!");
        


    }
}
