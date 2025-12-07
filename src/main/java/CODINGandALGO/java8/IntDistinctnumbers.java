package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntDistinctnumbers {
    public static void main(String[] args) {
      int[] numbers = {1, 3, 3, 4, 5, 6, 8, 8, 9, 10};
      Arrays.stream(numbers).distinct().boxed().collect(Collectors.toList());
      List<Integer> distinctNumbers = Arrays.asList(1, 1, 1, 4, 4, 6, 7, 9, 9, 10);
      Arrays.stream(numbers).boxed().distinct().collect(Collectors.toList()).forEach(System.out::print);
      System.out.println();
      Arrays.stream(numbers).distinct().boxed().collect(Collectors.toList()).forEach(System.out::print);

    }
}
