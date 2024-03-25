import java.util.Scanner;
public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short weight;
        System.out.print("Enter your weight: ");
        weight = scan.nextShort();
        if((weight - 30) <= 250 ||(weight + 30) <= 250)
            System.out.println("You are allowed in the contest!");
        else    
            System.out.println("You are not allowed in the contest!");
    
    }
}
