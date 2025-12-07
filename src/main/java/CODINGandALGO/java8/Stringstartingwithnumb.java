package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;

public class Stringstartingwithnumb {
    public static void main(String[] args) {
      //String starting with numb
      List<String> fruits = Arrays.asList("apple", "1banana", "1avocado", "2cherry", "3apricot");
      fruits.stream().filter(String -> Character.isDigit(String.charAt(0))).sorted().forEach(System.out::println);
      System.out.println();
    }
}
