package CODINGandALGO;
import java.util.HashMap;

public class CharacterFrequency {
  public static void frequencyCount(String s) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }

    System.out.println("Character Frequency: " + frequencyMap);
  }

  public static void main(String[] args) {
    String s = "aabbbc";
    frequencyCount(s);
  }
}
