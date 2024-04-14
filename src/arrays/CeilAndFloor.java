package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class CeilAndFloor {

  public static void main(String[] args) {
    int[] arr = {19, 23, 56, 61, 72, 88, 92};
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Enter a number to find the ceil and floor from " + Arrays.toString(arr) + ": ");
    int key = scanner.nextInt();
    System.out.println("Ceil of " + key + " is: " + ceil(key, arr));
    System.out.println("Floor of " + key + " is: " + floor(key, arr));
  }

  static int ceil(int key, int[] arr) {
    int low = 0, high = arr.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (key == arr[mid]) {
        return arr[mid];
      } else if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    if (low < arr.length) {
      return arr[low];
    }
    return -1;
  }

  static int floor(int key, int[] arr) {
    int low = 0, high = arr.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (key == arr[mid]) {
        return arr[mid];
      } else if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    if (high >= 0) {
      return arr[high];
    }
    return -1;
  }


}
