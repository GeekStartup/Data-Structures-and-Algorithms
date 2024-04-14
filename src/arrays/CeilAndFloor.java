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
    System.out.println("Ceil of " + key + " is: " + ceil(key));
    System.out.println("Floor of " + key + " is: " + floor(key));
  }

  static int ceil(int key) {
    return -1;
  }

  static int floor(int key) {
    return -1;
  }


}
