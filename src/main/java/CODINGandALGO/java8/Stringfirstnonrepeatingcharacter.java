package CODINGandALGO.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringfirstnonrepeatingcharacter {

    public static void main(String[] args) {
      String str = "swissword";
      char ch = str.chars()
        .mapToObj( c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(entry -> entry.getValue() == 1)
        .map(Map.Entry :: getKey).findFirst().get();
      System.out.println("First non-repeating character : "+ch);
    }
}
