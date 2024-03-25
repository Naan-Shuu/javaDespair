import java.util.Scanner;
public class RunOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start, end, i = 1, rep;

        System.out.println("Enter start:");
        start = scan.nextInt();
        System.out.println("Enter end:");
        end = scan.nextInt();
        System.out.println("\n");
        
        rep = (end - start) + 1;


        while(i <= rep){
            System.out.println(start);
            start++;
            i++;
        }

    }
}
