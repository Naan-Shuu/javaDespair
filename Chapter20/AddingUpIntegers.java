import java.util.Scanner;

public class AddingUpIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, num, i = 0, sum = 0;

        System.out.println("How many integers will be added:");
        input = scan.nextInt();

        while(i < input){
            System.out.println("Enter an integer: ");
            num = scan.nextInt();
            sum += num;
            i++;
        }
        System.out.println("The sum is "+sum);
    }
}
