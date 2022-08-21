import java.util.Scanner;

public class App {

    public static void main(String[] args) {
      try {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("scanner ==> "+ scanner);
        int value = scanner.nextInt();
        System.out.println("value ==> "+ value +"" + scanner);
      } catch (Exception e) {
        System.out.println("Error in Parsing ");
      }
    }
}