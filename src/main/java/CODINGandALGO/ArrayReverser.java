package CODINGandALGO;

import java.util.Arrays;

public class ArrayReverser {
  public static void reverseArray(int[] array) {
    int left = 0, right = array.length - 1;

    while (left < right) {
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    reverseArray(numbers);
    System.out.println(Arrays.toString(numbers)); // Output: [5, 4, 3, 2, 1]
  }
}
