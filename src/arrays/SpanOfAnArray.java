package arrays;

import java.util.Arrays;

public class SpanOfAnArray {

  public static void main(String[] args) {
    int[] arr = {20, 42, 88, 10, 99, 6};
    System.out.println("Span of " + Arrays.toString(arr) + ": " + span(arr));
  }

  static int span(int[] arr) {
    int max = arr[0];
    int min = arr[0];

    for (Integer a : arr) {
      if (a > max) {
        max = a;
      }
      if (a < min) {
        min = a;
      }
    }
    return max - min;
  }

}
