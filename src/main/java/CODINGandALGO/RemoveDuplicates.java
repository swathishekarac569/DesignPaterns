package CODINGandALGO;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
  public static String removeDuplicates(String s) {
    LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

    for (char c : s.toCharArray()) {
      uniqueChars.add(c);
    }

    StringBuilder result = new StringBuilder();
    for (char c : uniqueChars) {
      result.append(c);
    }

    return result.toString();
  }

  public static void main(String[] args) {
    String s = "aabbccdd";
    System.out.println("String after removing duplicates: " + removeDuplicates(s));
  }
}
