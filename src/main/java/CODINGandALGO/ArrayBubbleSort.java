package CODINGandALGO;

import java.util.Arrays;

public class ArrayBubbleSort {
  public static void bubbleSort(int[] mergearray) {
    int n = mergearray.length;

for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (mergearray[j] > mergearray[j + 1]) {
          int temp = mergearray[j];
          mergearray[j] = mergearray[j + 1];
          mergearray[j + 1] = temp;
        }
      }
    }

  }

  public static void main(String[] args) {
    //int[] numbers = {5, 1, 4, 2, 8};
    int[] numbers =  {3, 27, 38, 43, 3, 27, 38};
    bubbleSort(numbers);
    System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 4, 5, 8]
  }


}
