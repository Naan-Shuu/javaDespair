import java.util.Scanner;

public class WordSeparatedByDots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1, word2, dots = "";
        int len1, len2, diff, sumLen, i = 0;
        System.out.println("Enter first word:");
        word1 = scan.nextLine();
        System.out.println("Enter second word:");
        word2 = scan.nextLine();
        len1 = word1.length();
        len2 = word2.length();
        sumLen = len1 + len2;
        diff = 30 - sumLen;

    
        while(i < diff){
            dots+=".";
            i++;
        }
        System.out.println(word1 + dots + word2);
    }
}
