package CODINGandALGO;

public class SlidingWindow {
  public static int maxSumSubarray(int[] nums, int k) {
    int windowSum = 0;
    int maxSum = Integer.MIN_VALUE;

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
    int k = 3;
    System.out.println("Maximum sum of subarray: " + maxSumSubarray(nums, k));
  }
}
