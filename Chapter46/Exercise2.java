import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        HelloObject anObject = new HelloObject();
        anObject.speakMorning();
        anObject.speakEvening();
    }
}

class HelloObject
{
  //Morning greeting
  public void speakMorning()
  {
    System.out.println("Good morning World!");
  }
  //Evening greeting
  public void speakEvening()
  {
    System.out.println("Good evening World!");
  }
}
