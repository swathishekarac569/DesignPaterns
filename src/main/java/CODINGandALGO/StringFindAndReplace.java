package CODINGandALGO;

import java.util.Arrays;

public class StringFindAndReplace {
  public static String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {
    StringBuilder result = new StringBuilder(s);
    int offset = 0;

    Object[] combined = new Object[indexes.length];
    for (int i = 0; i < indexes.length; i++) {
      combined[i] = new int[]{indexes[i], i};
    }
    Arrays.sort(combined, (a, b) -> Integer.compare(((int[]) a)[0], ((int[]) b)[0]));

    for (Object obj : combined) {
      int i = ((int[]) obj)[1];
      int idx = indexes[i];
      String source = sources[i];
      String target = targets[i];

      if (result.substring(idx + offset, idx + offset + source.length()).equals(source)) {
        result.replace(idx + offset, idx + offset + source.length(), target);
        offset += target.length() - source.length();
      }
    }
    return result.toString();
  }
  public static void main(String[] args) {
    String s = "abcd";
    int[] indexes = {0, 2};
    String[] sources = {"a", "cd"};
    String[] targets = {"eee", "fff"};

    System.out.println("Modified string: " + findReplaceString(s, indexes, sources, targets));
  }
}
