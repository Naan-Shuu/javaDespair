import java.util.Scanner;
import java.text.*;

public class MicrowaveMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int time, min, sec;

        System.out.print("Enter cook time -> ");
        time = scan.nextInt();
        
        //Turns the input number into a timer, ex. 123 turns to 1:23
        min = time / 100;
        sec = time % 100;
        System.out.println("Your time -> "+min+":"+df.format(sec));    
    }
}
