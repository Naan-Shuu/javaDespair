import java.util.Scanner;

public class OneLetterPerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len, i = 0;
        char letters;
        String word;

        System.out.print("Enter a word: ");
        word = scan.nextLine();

        len = word.length();

        while(i < len){
            letters = word.charAt(i);
            System.out.println(letters);
            i++;
        }
    }
}
