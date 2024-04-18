package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfAnElement {

  public static void main(String[] args) {
    int[] arr = {3, 4, 4, 4, 4, 4, 4, 7};
    System.out.println(
        "Enter a number to find the first and last position in " + Arrays.toString(arr) + ": ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(Arrays.toString(getFirstAndLastPosition(arr, num)));
  }

  //O(log n)
  static int[] getFirstAndLastPosition(int[] arr, int num) {
    int low = 0, high = arr.length - 1, mid;
    int[] result = {-1, -1};
    if (arr.length == 0) {
      return result;
    }
    //Find first position
    while (low <= high) {
      mid = (low + high) / 2;
      if (num == arr[mid]) {
        result[0] = mid;
        high = mid - 1;
      } else if (num > arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    //find last position
    low = 0;
    high = arr.length - 1;
    while (low <= high) {
      mid = (low + high) / 2;
      if (num == arr[mid]) {
        result[1] = mid;
        low = mid + 1;
      } else if (num > arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return result;
  }

}
