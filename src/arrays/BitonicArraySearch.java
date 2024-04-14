package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BitonicArraySearch {

  public static void main(String[] args) {
    int[] arr = {5, 6, 7, 8, 9, 10, 3, 2, 1};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find in Bitonic Array " + Arrays.toString(arr) + ": ");
    int key = scanner.nextInt();
    int bitonicIndex = findBitonicPoint(arr);
    System.out.println("Index of " + key + " in Bitonic Array " + Arrays.toString(arr) + " is: "
        + searchBitonicArray(arr, key, bitonicIndex));
  }

  static int searchBitonicArray(int[] arr, int key, int bitonicIndex) {
    if (key == arr[bitonicIndex]) {
      return bitonicIndex;
    }
    if (key > arr[bitonicIndex]) {
      return -1;
    }

    int ascBinarySearchRes = binarySearchAscending(key, arr, bitonicIndex - 1);
    if (ascBinarySearchRes != -1) {
      return ascBinarySearchRes;
    }

    int descBinarySearchRes = binarySearchDescending(key, arr, bitonicIndex + 1);
    return descBinarySearchRes;

  }

  //O(log n)
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

  //O(log n)
  static int binarySearchAscending(int key, int[] arr, int range) {
    int low = 0, high = range, mid;
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

  //O(log n)
  static int binarySearchDescending(int key, int[] arr, int range) {
    int low = range, high = arr.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (key == arr[mid]) {
        return mid;
      } else if (key < arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }


}
