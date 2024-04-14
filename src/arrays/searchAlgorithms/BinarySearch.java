package arrays.searchAlgorithms;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {12, 45, 64, 89, 78, 100, 96, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
        17, 18, 10000, 3577, 64839, 56758, 37474, 476575, 464746, 7264278, 4547456, 34545,
        35634746};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find the position in " + Arrays.toString(arr) + ":");
    int key = scanner.nextInt();
    System.out.println("Position of " + key + " : " + binarySearch(arr, key));
  }

  //Binary Search - O(log n)
  //Sort - O(n log n)
  //Total - O(n log n + log n)
  //It is always better to use Linear search for unsorted array.
  static int binarySearch(int[] arr, int key) {
    Arrays.sort(arr);
    int low = 0, high = arr.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (key == arr[mid]) {
        return mid;
      } else if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

}
