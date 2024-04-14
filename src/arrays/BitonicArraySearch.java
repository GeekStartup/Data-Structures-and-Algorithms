package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BitonicArraySearch {

  public static void main(String[] args) {
    int[] arr = {5, 6, 7, 8, 9, 10, 3, 2, 1};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find in Bitonic Array " + Arrays.toString(arr) + ": ");
    int num = scanner.nextInt();
    int bitonicPoint = findBitonicPoint(arr);
    System.out.println(bitonicPoint);
  }

  static int findBitonicPoint(int[] arr) {
    int left = 0, right = arr.length - 1, mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return -1;
  }


}
