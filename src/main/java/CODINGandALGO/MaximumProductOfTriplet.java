package CODINGandALGO;

import java.util.Arrays;

public class MaximumProductOfTriplet {
  public static int findMaximumProductOfTriplet(int[] arr) {
    if (arr.length < 3) {
      throw new IllegalArgumentException("Array must have at least three elements");
    }

    // Sort the array
    Arrays.sort(arr);

    int n = arr.length;

    // Maximum product can be either:
    // 1. Product of the three largest numbers
    int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];

    // 2. Product of the two smallest numbers (negative) and the largest number
    int product2 = arr[0] * arr[1] * arr[n - 1];

    // Return the maximum of the two products
    return Math.max(product1, product2);
  }

  public static void main(String[] args) {
    int[] inputArray = {-1, -4, 3, -6, 7, 0};
    System.out.println("Maximum product of a triplet: " + findMaximumProductOfTriplet(inputArray));
  }
}
