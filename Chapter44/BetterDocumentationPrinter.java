import java.util.Scanner;
public class BetterDocumentationPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        boolean comment = false;

        while (scan.hasNextLine()) {
            input = scan.nextLine();
            if (!comment) {
                if (input.contains("//")) 
                    System.out.println(input.substring(input.indexOf("//")));
                else if (input.contains("/*")) {
                    comment = true;
                    System.out.println(input.substring(input.indexOf("/*")));
                }
            } 
            else {
                System.out.println(input.substring(0, input.indexOf("*/")));
                if (input.contains("*/")) 
                    comment = false;
            }
        }
    }
}