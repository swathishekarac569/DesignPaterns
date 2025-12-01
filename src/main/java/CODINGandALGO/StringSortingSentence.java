package CODINGandALGO;

public class StringSortingSentence {

  public static String sortSentence(String s) {
    // Split the input string into individual words
    String[] words = s.split(" ");

    String[] result = new String[words.length];

    for (String word : words) {
      int position = Character.getNumericValue(word.charAt(word.length() - 1));
      String actualWord = word.substring(0, word.length() - 1);
      result[position - 1] = actualWord;
    }

    StringBuilder sortedSentence = new StringBuilder();
    for (int i = 0; i < result.length; i++) {
      sortedSentence.append(result[i]);
      if (i < result.length - 1) {
        sortedSentence.append(" ");
      }
    }

    return sortedSentence.toString();
  }

  public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
    String sorted = sortSentence(s);
    System.out.println(sorted); // Output: This is a sentence
  }
}
