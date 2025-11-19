package CODINGandALGO;

public class ReverseWords {
  public static String reverseWords(String sentence) {
    String[] words = sentence.trim().split(" ");
    int left = 0, right = words.length - 1;

    while (left < right) {
      String temp = words[left];
      words[left] = words[right];
      words[right] = temp;
      left++;
      right--;
    }
    return String.join(" ", words);
  }

  public static void main(String[] args) {
    String sentence = "Hello World!";
    System.out.println(reverseWords(sentence)); // Output: "World! Hello"
  }
}
