package CODINGandALGO;

import java.util.Scanner;

public class CoffeeProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Coffee Machine!");
    System.out.println("Select Coffee Type:");
    System.out.println("1. Espresso");
    System.out.println("2. Cappuccino");
    System.out.println("3. Latte");

    int choice = scanner.nextInt();
    switch (choice) {
      case 1 -> System.out.println("Making Espresso...");
      case 2 -> System.out.println("Making Cappuccino...");
      case 3 -> System.out.println("Making Latte...");
      default -> System.out.println("Invalid Choice!");
    }

    System.out.println("Your coffee is ready. Enjoy!");
  }
}
