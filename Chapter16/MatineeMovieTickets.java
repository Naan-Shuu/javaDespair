import java.util.Scanner;
public class MatineeMovieTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short time, age;
        double adultPrice, childPrice;

        System.out.println("What is your age?");
        age = scan.nextShort();
        System.out.println("What is the time(Use 24-hr clock):");
        time = scan.nextShort();

        if(age > 13)
            if(time < 1700){
                adultPrice = 5.00;
                System.out.println("Ticket price is $"+adultPrice);
            }
            else{
                adultPrice = 8.00;
                System.out.println("Ticket price is $"+adultPrice);
            }
        else if(age < 13)
            if(time < 1700){
                childPrice = 2.00;
                System.out.println("Ticket price is $"+childPrice);
            }
            else{
                childPrice = 4.00;
                System.out.println("Ticket price is $"+childPrice);
            }
    }
}
