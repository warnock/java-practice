import java.io.Console;

public class codingTime{
  public static void main(String[] args){
    // String consoleInput;
    int codePracticeTime = 0;
    // Console myConsole = System.console();

    System.out.println("How much time did you spend coding yesterday?");
    codePracticeTime += convertInput();
    System.out.println("How much time did  you spend coding the day before?");
    codePracticeTime += convertInput();
    System.out.println("How much time did  you spend coding so far today?");
    codePracticeTime += convertInput();
    // consoleInput = myConsole.readLine();
    // codePracticeTime += Integer.parseInt(consoleInput);

    System.out.println("You coded for " + codePracticeTime + " hours");
  }

  public static int convertInput(){
    Console myConsole = System.console();
    String consoleInput = myConsole.readLine();
    int consoleInt = Integer.parseInt(consoleInput);
    return consoleInt;
  }
}
