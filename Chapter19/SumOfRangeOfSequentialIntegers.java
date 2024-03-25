import java.util.Scanner;

public class SumOfRangeOfSequentialIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0, form, i = 0, low = 5, high=10;
        /*System.out.println("Enter low:");
        low = scan.nextInt();
        System.out.println("Enter high:");
        high = scan.nextInt();
        */
        n = high - low;

        while(i <= n){
            sum += i + low;
            i++;
        }

        form = ((low + high)*(((high - low))+1)/2);
        System.out.println("Sum = "+sum);
        System.out.println("Formula Sum = "+form);
    }
}

