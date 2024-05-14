import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        HelloObject anObject = new HelloObject();
        anObject.speak();
    }
}

class HelloObject
{
  public void speak()
  {
    System.out.println("Good morning World!");
    System.out.println("Good evening World!");
  }
}

