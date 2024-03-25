import java.util.Scanner;
public class CheckCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short checkAcc, saveAcc;

        System.out.print("How much do you have in your checking account? ");
        checkAcc = scan.nextShort();
        System.out.print("How much do you have in your savings account? ");
        saveAcc = scan.nextShort();

        if(checkAcc > 1000 || saveAcc > 1500)
            System.out.println("No service charge!");
        else
            System.out.println("It cost $0.15 per check!");
    }
}
