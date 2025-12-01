package CODINGandALGO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairWithGivenSum {
  public static List<int[]> findPairsWithSum(int[] arr, int target) {
    List<int[]> pairs = new ArrayList<>();
    int left = 0, right = arr.length - 1;

    while (left < right) {
      int currentSum = arr[left] + arr[right];

      if (currentSum == target) {
        pairs.add(new int[]{arr[left], arr[right]});
        // Move both pointers inward to find other pairs
        left++;
        right--;
      } else if (currentSum < target) {
        left++; // Increase the sum by moving the left pointer right
      } else {
        right--; // Decrease the sum by moving the right pointer left
      }
    }

    return pairs;
  }

  public static void main(String[] args) {
    int[] sortedArray = {1, 2, 3, 4, 5, 6};
    int targetSum = 7;

    // Call the method.
    List<int[]> result = findPairsWithSum(sortedArray, targetSum);

    // Print the result pairs.
    for (int[] pair : result) {
      System.out.println("(" + pair[0] + ", " + pair[1] + ")");
    }
  }
}
