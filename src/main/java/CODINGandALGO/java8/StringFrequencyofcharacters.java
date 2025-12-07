package CODINGandALGO.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequencyofcharacters {

  public static void main(String[] args) {
    String st = "aawwssvvggttddqs";
    Map<Character, Long> frequencyMap = st.chars()
      .mapToObj(c -> (char) c)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    frequencyMap.forEach((k, v) -> System.out.print("Character: " + k + ", Frequency: " + v + "\n"));
  }
}
