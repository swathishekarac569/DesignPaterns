package CODINGandALGO;

import java.util.Arrays;

public class MoveZeros {
  public static void moveZerosToEnd(int[] nums) {
    int index = 0;

    // Place all non-zero elements at the front
    for (int num : nums) {
      if (num != 0) {
        nums[index++] = num;
      }
    }

    // Fill the rest with zeros
    while (index < nums.length) {
      nums[index++] = 0;
    }
  }

  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    moveZerosToEnd(nums);
    System.out.println(Arrays.toString(nums));
  }
}
