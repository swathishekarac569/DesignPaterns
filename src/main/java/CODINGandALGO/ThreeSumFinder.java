package CODINGandALGO;


//Find three numbers in an array whose sum equals zero
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumFinder {
  public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate
      int left = i + 1, right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 6) {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
          while (left < right && nums[left] == nums[left - 1]) left++; // Skip duplicate
          while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicate
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int[] nums1 = {-1, 2, 3, 1, -1, -1};
    System.out.println(findTriplets(nums1)); // Output: [[-1, -1, 2], [-1, 0, 1]]
  }
}
