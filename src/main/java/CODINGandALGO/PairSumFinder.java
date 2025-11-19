package CODINGandALGO;

import java.util.Arrays;

public class PairSumFinder {
  public static int[] findPairWithSum(int[] array, int target) {
    int left = 0, right = array.length - 1;

    while (left < right) {
      int sum = array[left] + array[right];
      if (sum == target) {
        return new int[] {left, right};
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[] {-1, -1}; // No pair found
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 6};
    int target = 6;
    System.out.println(Arrays.toString(findPairWithSum(numbers, target))); // Output: [0, 3]
  }
}
