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
    
    anObject.speak(len, word);
  }
}

class HelloObject
{
  public void speak(int a, String word)
  {
    for(int i = 0; i < a; i++)
      System.out.println(word);
  }
}

