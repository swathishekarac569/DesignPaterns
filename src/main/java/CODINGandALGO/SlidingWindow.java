package CODINGandALGO;

import java.util.Arrays;

public class SlidingWindow {
  public static int maxSumSubarray(int[] nums, int k) {
    int windowSum = 0;
    int maxSum =0;

    // Initialize the first window
    for (int i = 0; i < k; i++) {
      windowSum += nums[i];
    }
    maxSum = windowSum;

    // Slide the window
    for (int i = k; i < nums.length; i++) {
      windowSum += nums[i] - nums[i - k];
      maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = {1, 3, 2, 5, 1, 6, 3};
    Arrays.sort(nums);
    int peorduct = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
    System.out.println("Maximum sum of subarray: "+ peorduct);
    int k = 3;
    System.out.println("Maximum sum of subarray: " + maxSumSubarray(nums, k));
  }
}
