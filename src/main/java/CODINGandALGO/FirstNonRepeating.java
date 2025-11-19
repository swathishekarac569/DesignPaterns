package CODINGandALGO;

import java.util.HashMap;

public class FirstNonRepeating {
  public static char firstNonRepeatingCharacter(String s) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }

    for (char c : s.toCharArray()) {
      if (frequencyMap.get(c) == 1) {
        return c;
      }
    }
    return '_'; // Return underscore if no non-repeating found
  }

  public static void main(String[] args) {
    String s = "swiss";
    System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(s));
  }
}
