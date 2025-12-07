package CODINGandALGO.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StringCountvowelsinastring {
    public static void main(String[] args) {
        String str = "Hello World";
        long count = str.chars()
                        .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                        .count();



      // Display vowels
      List<Character> vowels = str.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
        .collect(Collectors.toList());

      System.out.println("Number of vowels in the string: " + count);
      System.out.println("Vowels in the string: " + vowels);
    }
}
