import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass;
        int i;
        char word;
        boolean control = true, lower = false, upper = false, digit = false;

        do{
            System.out.println("Enter password:");
            pass = scan.nextLine();

            if(pass.length() < 7){
                System.out.println("Password must be at least 7 characters long, contains uppercase, lowercase, and a digit");
                System.out.println();
            }
            else{
                //Checks if the password got an uppercase, lowercase and a digit
                for(i = 0; i < pass.length(); i++){
                word = pass.charAt(i);
                if(Character.isUpperCase(word))
                    upper = true;
                if(Character.isLowerCase(word))
                    lower = true;
                if(Character.isDigit(word))
                    digit = true;
                }
                //If no digit or lowercase or uppercase, this block will execute
                if(!upper || !lower || !digit){
                    System.out.println("That password is not acceptable.");
                    System.out.println();
                }
                else{
                    System.out.println("Acceptable password.");
                    control = false;
                }
            } 
        }while(control);
        
    }
}