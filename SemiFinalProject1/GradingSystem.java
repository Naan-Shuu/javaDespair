import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte input;
        double quiz, lab, exam, grade;
        String term = "";

        do{
            System.out.println("Options:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit App");
            System.out.print("Press 1 or 2 or 3: ");
            input = scan.nextByte();
            switch (input){
                case 1:
                    term = "Midterm";
                    break;
                case 2:
                    term = "Final";
                    break;
                case 3:
                    System.out.println("Exiting the App!");
                    break;
            default:
                System.out.println("Input numbers only between 1, 2 , or 3");
                break;
            }
            if(input == 1 || input == 2){
                System.out.print("Enter your Quiz Grade: ");
                quiz = scan.nextDouble();
                while(quiz < 1 || quiz > 5){
                    System.out.println("Grade cannot be less than 1 or greater than 5!");
                    System.out.print("Enter your Quiz Grade: ");
                    quiz = scan.nextDouble();
                }
                System.out.print("Enter your Labworks Grade: ");
                lab = scan.nextDouble();
                while(lab < 1 || lab > 5){
                    System.out.println("Grade cannot be less than 1 or greater than 5!");
                    System.out.print("Enter your Labworks Grade: ");
                    lab = scan.nextDouble();
                }
                System.out.print("Enter your "+term+" Grade: ");
                exam = scan.nextDouble();
                while(exam < 1 || exam > 5){
                    System.out.println("Grade cannot be less than 1 or greater than 5!");
                    System.out.print("Enter your "+term+" Grade: ");
                    exam = scan.nextDouble();
                }
                grade = (quiz * 0.20)+(lab * 0.40)+(exam * 0.40);
                System.out.println(term+" Grade: "+grade);
                if(grade < 3)
                    System.out.println("Remarks: PASSED!\n");
                else 
                    System.out.println("Remarks: FAILED!\n"); 
            }            
        }while(input != 3);
    }
}