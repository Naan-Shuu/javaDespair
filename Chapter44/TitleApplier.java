import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, firstName;
        int space;
        
        do{
        System.out.println("Enter a name: ");
        name = scan.nextLine().trim();
        space = name.indexOf(' ');
        //Gets the first name of the person to compare to the names below in the if statements
        firstName = name.substring(0, space);
        //Checks if the input is one of the female name, if so, this block will execute
        if(firstName.equals("Amy")|| firstName.equals("Buffy")|| firstName.equals("Cathy"))
            System.out.println("Ms. "+name);
        //Checks if the input is one of the male name, if so, this block will execute
        else if(firstName.equals("Elroy")|| firstName.equals("Fred")|| firstName.equals("Graham"))
            System.out.println("Mr. "+name);
        else
            System.out.println(name);
        }while(!name.isEmpty());
    }
}
