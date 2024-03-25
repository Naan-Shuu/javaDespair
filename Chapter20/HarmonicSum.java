import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i = 1;
        double sum = 0;

        System.out.println("Enter N:");
        num = scan.nextInt();

        while(i <= num){
            sum += 1.0/i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}
