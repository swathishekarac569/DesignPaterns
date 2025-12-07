package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.Collections;

public class Intsecondhighestnumber {

    public static void main(String[] args) {
      int[] arrayWithDuplicates = {1, 3, 5, 7, 9, 9, 8, 6, 5, 4, 3, 2, 1};
      Arrays.stream(arrayWithDuplicates)
        .boxed()
        .sorted(Collections.reverseOrder())
        .distinct().skip(1)
        .findFirst().ifPresent(n -> System.out.println("Second highest number: " + n));
    }
}
