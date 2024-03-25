import java.util.Scanner;

public class SumOfSequentialIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0, form, i = 0;
        System.out.println("Enter N:");
        n = scan.nextInt();
        
        while(i <= n){
            sum += i;
            i++;
        }
        form = (n*(n+1))/2;
        System.out.println("Sum = "+sum);
        System.out.println("Formula Sum = "+form);
    }
}   
