import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = " ", firstName = " ", lastName = " ", fullName = " ";  
        int space;
        
        System.out.print("Enter your name:");
        name = scan.nextLine().trim();
        space = name.indexOf(' '); // Gets the index of the whitespace
        
        if(space != -1){
            firstName = name.substring(0, space);
            lastName = name.substring(space + 1); //Adding 1 to the index so it will get the first letter of the last name
            lastName = lastName.toUpperCase();
            fullName = firstName+" "+lastName;
            System.out.println(fullName);
        }
        else    
            System.out.println("Invalid input, you invalid!");
    }
}
