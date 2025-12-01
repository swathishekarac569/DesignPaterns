package CODINGandALGO;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringFirstNonRepeatingAndRepeating {
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
  public static char secondRepeatingCharacter(String s) {
    HashMap<Character, Integer> frequencyMap = new LinkedHashMap<>(); // Use LinkedHashMap to preserve insertion order
    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }
    int repeatingCount = 0;
    for (char c : s.toCharArray()) { // Iterate the string again to respect original order
      if (frequencyMap.get(c) > 1) {
        repeatingCount++;
        if (repeatingCount == 2) { // If it's the second repeating character
          return c;
        }
      }
    }
    return '_'; // Return underscore if no second repeating character is found
  }
  public static char RepeatingCharacter(String s) {
    HashMap<Character, Integer> frequencyMap = new HashMap<>();
    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }
    for (char c : s.toCharArray()) {
      if (frequencyMap.get(c) != 1) {
        return c;
      }
    }
    return '_'; // Return underscore if no non-repeating found
  }

  public static void main(String[] args) {
    String s = "sppwissword";
    System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(s));
    System.out.println("First repeating character: " + RepeatingCharacter(s));
    System.out.println("Second repeating character: " + secondRepeatingCharacter(s));
  }
}
