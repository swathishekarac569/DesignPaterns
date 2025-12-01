package CODINGandALGO;

import java.util.Arrays;

public class ArrayMergeTwoSortedArrays {

  public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

      int[] mergearray = new int[arr1.length + arr2.length];
      int index = 0 ;
      for(int i = 0 ; i < arr1.length ; i ++ ){
        mergearray[index++] = arr1[i] ;
      }
      for(int j = 0  ; j <arr2.length ; j ++ ){
        mergearray[index++] =arr1[j] ;
      }
      System.out.println(Arrays.toString(mergearray));
      int n = mergearray.length;
      for(int i = 0 ; i < n -1 ; i ++){
        for(int j = 0 ; j < n-i-1 ; j++){
          if(mergearray[j] > mergearray[j+1]){
            int temp = mergearray[j];
            mergearray[j] = mergearray[j+1];
            mergearray[j+1] = temp;
          }
        }
      }

      System.out.println(Arrays.toString(mergearray));
    return mergearray; // Return the merged array
  }

  // Driver Code
  public static void main(String[] args) {
    int[] arr1 = {3, 27, 38, 43}; // Presorted array
    int[] arr2 = {9, 10, 82};     // Presorted array

    // Merge the two sorted arrays
    int[] mergedArray = mergeTwoSortedArrays(arr1, arr2);

    // Output the merged sorted array
    System.out.println("Final"+Arrays.toString(mergedArray));
  }
}
