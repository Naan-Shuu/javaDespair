import java.util.Scanner;

public class Exercise1
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    String word;
    int len;
    word = scan.nextLine();
    System.out.println();
    len = word.length();

    HelloObject anObject = new HelloObject();
    //Sends the input and its length to the HelloObject class
    anObject.speak(len, word);
  }
}

class HelloObject
{
  //Gets the parameters needed to repeat the input
  public void speak(int a, String word)
  {
    for(int i = 0; i < a; i++)
      System.out.println(word);
  }
}

