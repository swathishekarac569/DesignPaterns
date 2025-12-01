package CODINGandALGO;

import java.util.HashMap;

public class StringLongestSubstringWithoutRepeatingCharacters {
  public static int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int maxLength = 0;
    int start = 0; // Start pointer

    for (int end = 0; end < s.length(); end++) {
      char currentChar = s.charAt(end);

      // If the character is already in the map, move the start pointer
      if (map.containsKey(currentChar)) {
        start = Math.max(start, map.get(currentChar) + 1);
      }

      // Put the current character and its index in the map
      map.put(currentChar, end);

      // Update max length
      maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3 ("abc")
    System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1 ("b")
    System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3 ("wke")
    System.out.println(lengthOfLongestSubstring(""));         // Output: 0
    System.out.println(lengthOfLongestSubstring("au"));       // Output: 2 ("au")
  }
}
