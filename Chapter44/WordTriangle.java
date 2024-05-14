import java.util.Scanner;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int i, j, len;
        System.out.print("Enter a word -->");
        word = scan.nextLine();
        len = word.length();

        for (i = 0; i < len; i++) {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            //Makes the input a substring to cut off the first and last word
            if (i < len)
                System.out.println(word.substring(i, len--));
        }
    }
}
