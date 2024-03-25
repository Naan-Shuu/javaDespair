import java.util.Scanner;
public class EchoedWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int length, i = 0;
        System.out.println("Enter a word:");
        word = scan.nextLine();
        System.out.println("\n");

        length = word.length();
        
        while(i < length){
            System.out.println(word);
            i++;
        }
    }
}
