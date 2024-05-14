import java.util.Scanner;

public class OneCharPerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int i;
        System.out.println("Enter a string: ");
        word = scan.nextLine();
        System.out.println();
        //Prints out the word letter by letter
        for(i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }      
    }
}