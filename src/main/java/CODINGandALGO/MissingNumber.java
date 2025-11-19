package CODINGandALGO;

public class MissingNumber {
  public static int findMissingNumber(int[] nums, int n) {
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 5};
    int n = 5; // Array contains numbers from 1 to 5
    System.out.println("Missing number: " + findMissingNumber(nums, n));
  }
}
