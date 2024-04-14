package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {12, 45, 64, 89, 78, 100, 96, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
        17, 18, 10000, 3577, 64839, 56758, 37474, 476575, 464746, 7264278, 4547456, 34545,
        35634746};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find the position in " + Arrays.toString(arr) + ":");
    int key = scanner.nextInt();
    System.out.println("Position of " + key + " : " + linearSearch(arr, key));
  }

  //O(n)
  static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

}
