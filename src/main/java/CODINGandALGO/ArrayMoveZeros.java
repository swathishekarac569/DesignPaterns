package CODINGandALGO;

import java.util.Arrays;

public class ArrayMoveZeros {
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


  public static void moveZerosToEnd1(int[] nums) {
    int n = nums.length;
    int index = 0;
    for(int i = 0 ; i < n ; i++) {
      if(nums[i] != 0) {
        int temp = nums[i] ;
        nums[i] = nums[index];
        nums[index] = temp;
        index++;
      }
    }
/*   int i = 0;
    while(i < n ){
      if(nums[i] != 0) {
        int temp = nums[i] ;
        nums[i] = nums[index];
        nums[index] = temp;
        index++;
      }
      i++;
    }*/

    System.out.println(n);
    System.out.println(Arrays.toString(nums));
  }
  public static void main(String[] args) {
    int[] nums = {0, 0, 1 , 0, 3, 12};
    moveZerosToEnd1(nums);
    System.out.println(Arrays.toString(nums));
  }
}
