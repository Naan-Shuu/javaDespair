import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter Greeting: ");
        word = scan.nextLine();
        System.out.println();
        HelloObject anObject = new HelloObject();
        anObject.speak(word);
    }
}

class HelloObject
{
    public void speak(String greet){
        System.out.println(greet);
    }
    public HelloObject(){
        System.out.println("Good morning World!");
        System.out.println("Good evening World!");
    }
}


