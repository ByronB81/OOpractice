import java.io.Console;

public class CodeTracker {
  public static void main(String[] args) {
    codeTime("Monday");
  }

  public static void codeTime(Integer day){
    Console hax = System.console();
    System.out.println("How many hours did you code on" + day +"?");
    String strNum = console.readLine();
    Integer hours = Integer.parseInt(strNum);
    System.out.println("You coded " + hours);

  }
}
