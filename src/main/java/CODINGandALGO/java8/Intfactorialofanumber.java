package CODINGandALGO.java8;

import java.util.stream.IntStream;

public class Intfactorialofanumber {
    public static void main(String[] args) {
      int number = 5;
      long factorial = IntStream.rangeClosed(1, number)
        .reduce(1, (a, b) -> a * b);
      System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
