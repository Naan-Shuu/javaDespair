import java.util.Scanner;

public class DocumentationPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;


        while (scan.hasNextLine()) {
            input = scan.nextLine();
            int start = input.indexOf("//");
            if (input.contains("//"))
                System.out.println(input.substring(start));
        }
    }
}
class Output {
    // Hello World Program
    // written by Elmer

    // Here is the main method:
}