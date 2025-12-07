package CODINGandALGO.java8;

import java.util.Arrays;
import java.util.List;

public class Stringstouppcare {
    public static void main(String[] args) {
      List<String> stringList = Arrays.asList("apple", "banana", "cherry");
      stringList.stream().map(String :: toUpperCase).forEach(System.out::println);
      System.out.println();
    }
}
