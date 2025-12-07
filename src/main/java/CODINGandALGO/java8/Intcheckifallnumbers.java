package CODINGandALGO.java8;

import java.util.Arrays;

public class Intcheckifallnumbers {
    public static void main(String[] args) {
      int[] numbers = {2, 4, 6, 8, 10};
      // check if all numbers are positive
      boolean allPositive = Arrays.stream(numbers).allMatch(n -> n > 0);
      System.out.println("All numbers are positive: " + allPositive);

      // check if any number is greater than 8
      Arrays.stream(numbers).filter(n -> n > 8).forEach(n -> System.out.println("Number greater than 8: " + n));
      Arrays.stream(numbers).anyMatch(n -> n > 8);
    }
}
