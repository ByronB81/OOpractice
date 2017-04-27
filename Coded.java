import java.io.Console;

public class Coded {
  public static void main(String[] args) {
    public Integer total;
    codeTime("Monday");
  }

  public static void codeTime(String day){
    Console hax = System.console();
    System.out.println("How many hours did you code on " + day +" ?");
    String strNum = hax.readLine();
    Integer hours = Integer.parseInt(strNum);
    System.out.println("You coded " + hours + " hours");
    Integer i = 0;
    Integer total = i + hours;
    System.out.println(total);
  }
}
