package CODINGandALGO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDoubleAndTripletWithZeroSum {
  public static List<List<Integer>> findTripletsWithZeroSum(int[] arr) {
    //List<int[]> triplets = new ArrayList<>();
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 2; i++) {
      // Skip duplicates for the current element
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];
        //int sum = arr[left] + arr[right];

        if (sum == 2) {
          triplets.add(Arrays.asList(arr[i], arr[left], arr[right])); // sum of 3 digit
          //triplets.add(new int[]{arr[left], arr[right]}); // sum of 2 digit


          left++;
          right--;
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }

    return triplets;
  }

  public static void main(String[] args) {
    int[] inputArray = {-1, 0, 1, 1, -1, -4};

    //List<int[]> result = findTripletsWithZeroSum(inputArray);
    List<List<Integer>> result = findTripletsWithZeroSum(inputArray);

/*    for (int[] twoPair : result) {
      System.out.println("(" + twoPair[0] + ", " + twoPair[1] + ")");
    }*/

    for (List<Integer> tripletpair : result) {
      System.out.println("(" + tripletpair.get(0) + ", " + tripletpair.get(1) + ", " + tripletpair.get(2) + ")");
    }

  }
}
