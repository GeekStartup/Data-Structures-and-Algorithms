package arrays;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {

  public static void main(String[] args) {
    int[] arr = {20, 42, 88, 10, 99, 6};
    System.out.println("2nd largest value of " + Arrays.toString(arr) + ": " + secondLargest(arr));
    System.out.println(
        "2nd smallest value of " + Arrays.toString(arr) + ": " + secondSmallest(arr));
  }

  static int secondLargest(int[] arr) {
    int max1;
    int max2;
    if (arr[0] > arr[1]) {
      max1 = arr[0];
      max2 = arr[1];
    } else {
      max1 = arr[1];
      max2 = arr[0];
    }
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > max1) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] > max2) {
        max2 = arr[i];
      }
    }
    return max2;
  }

  static int secondSmallest(int[] arr) {
    int min1;
    int min2;

    if (arr[0] < arr[1]) {
      min1 = arr[0];
      min2 = arr[1];
    } else {
      min1 = arr[1];
      min2 = arr[0];
    }
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] < min1) {
        min2 = min1;
        min1 = arr[i];
      } else if (arr[i] < min2) {
        min2 = arr[i];
      }
    }
    return min2;
  }


}
