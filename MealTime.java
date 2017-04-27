import java.io.Console;

public class MealTime {
  public static void main(String[] args) {

    justAsk("breakfast");
    justAsk("lunch");
    justAsk("dinner");
  }

  public static void justAsk(String meal) {
    Console console = System.console();
    System.out.println("What did you have for " + meal + "?");
    String food = console.readLine();
    System.out.println("You had " + food + " for " + meal);
  }
}
