import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        byte str, hlt, luc;

        System.out.println("Welcome to Last Quest!");
        System.out.print("Enter the name of your character:");
        name = scan.nextLine();
        System.out.println("You have 15 points to allocate on characteristics!");
        System.out.println("Enter strength (1-10)");
        str = scan.nextByte();
        System.out.println("Enter health (1-10)");
        hlt = scan.nextByte();
        System.out.println("Enter luck (1-10)");
        luc = scan.nextByte();

        if(hlt + str + luc > 15){
            str = 5; hlt = 5; luc = 5;
            System.out.println("You have given your character too many points!");
            System.out.println("Default values have been assigned:");
            System.out.println(""+name+"\nStrength: "+str+"\nHealth: "+hlt+"\nLuck: "+luc);
        }
        else    
            System.out.println(""+name+"\nStrength: "+str+"\nHealth: "+hlt+"\nLuck: "+luc);

    }
}
