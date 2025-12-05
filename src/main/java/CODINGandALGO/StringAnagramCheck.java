package CODINGandALGO;

import java.util.Arrays;

public class StringAnagramCheck {
  public static boolean areAnagrams(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();

    for (int i = 0; i < s1Array.length - 1; i++) {
      for (int j = 0; j < s1Array.length - i - 1; j++) {
        if (s1Array[j] > s1Array[j + 1]) {
          char temp = s1Array[j];
          s1Array[j] = s1Array[j + 1];
          s1Array[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < s2Array.length - 1; i++) {
      for (int j = 0; j < s2Array.length - i - 1; j++) {
        if (s2Array[j] > s2Array[j + 1]) {
          char temp = s2Array[j];
          s2Array[j] = s2Array[j + 1];
          s2Array[j + 1] = temp;
        }
      }
    }

    //Arrays.sort(s1Array);
    //Arrays.sort(s2Array);



    return Arrays.equals(s1Array, s2Array);
  }

  public static void main(String[] args) {
    String s1 = "listen";
    String s2 = "silent";

    System.out.println(areAnagrams(s1, s2) ? "Strings are anagrams." : "Strings are not anagrams.");
  }



}

