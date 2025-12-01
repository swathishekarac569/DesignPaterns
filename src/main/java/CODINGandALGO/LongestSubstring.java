package CODINGandALGO;

import java.util.HashSet;

public class LongestSubstring {
  public static int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int maxLen = 0, start = 0;

    for (int end = 0; end < s.length(); end++) {
      while (set.contains(s.charAt(end))) {
        set.remove(s.charAt(start));
        start++;
      }
      set.add(s.charAt(end));
      maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
  }

  public static void main(String[] args) {
    String s = "abcaaabcre";
    System.out.println("Longest substring length: " + lengthOfLongestSubstring(s));
  }
}
