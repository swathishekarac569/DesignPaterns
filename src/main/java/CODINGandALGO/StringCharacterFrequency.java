package CODINGandALGO;
import java.util.HashMap;

public class StringCharacterFrequency {
  public static void frequencyCount(String s) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (c != ' ') {
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
      }
    }

    System.out.println("Character Frequency: " + frequencyMap);
  }

  public static void main(String[] args) {
    String sentence = "this is a test sentence";
    frequencyCount(sentence);
  }

}
