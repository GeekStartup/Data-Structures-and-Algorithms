package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountSmallAndEqualElements {

  public static void main(String[] args) {
    //int[] arr = {2, 6, 12, 18, 21, 26, 33, 42};
    //int[] arr = {2, 6, 12, 18, 21, 26, 26, 26};
    int[] arr = {2, 6, 12, 18, 26, 26, 33, 42};
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Enter a number to find the count of smaller and equal elements in " + Arrays.toString(arr)
            + ": ");
    int num = scanner.nextInt();
    System.out.println("Count: " + findCountSmallAndEqualElements(arr, num));
  }

  static int findCountSmallAndEqualElements(int[] arr, int num) {
    int low = 0, high = arr.length - 1, mid = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] == num) {
        while (mid+1 < arr.length && arr[mid + 1] == num) {
          mid++;
        }
        break;
      } else if (arr[mid] < num) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    if (arr[mid] > num) {
      return mid;
    }
    return mid + 1;
  }

}
