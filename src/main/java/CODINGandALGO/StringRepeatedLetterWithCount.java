package CODINGandALGO;

import java.util.HashMap;
import java.util.Map;

public class StringRepeatedLetterWithCount {
  public static void main(String[] args) {
    Map<Character, Integer> letterFrequencyMap = new HashMap<>();
    String sentence = "Hello World!";
    for (char c : sentence.toCharArray()) {
      if (Character.isLetter(c)) {
        c = Character.toLowerCase(c);
        letterFrequencyMap.put(c, letterFrequencyMap.getOrDefault(c, 0) + 1);
      }
    }
    System.out.println("Repeated letters and their counts:");
    for (Map.Entry<Character, Integer> entry : letterFrequencyMap.entrySet()) {
      if (entry.getValue() >= 1) {
        System.out.println("Letter: " + entry.getKey() + ", Count: " + entry.getValue());
      }
    }
  }
}
