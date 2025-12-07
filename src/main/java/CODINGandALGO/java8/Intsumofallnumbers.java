package CODINGandALGO.java8;

import java.util.Arrays;

public class Intsumofallnumbers {
    public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sum = Arrays.stream(numbers).sum();
      double average =  Arrays.stream(numbers).average().getAsDouble();
      System.out.println("Sum of all average: " + average);
      System.out.println("Sum of all numbers: " + sum);
    }
}
