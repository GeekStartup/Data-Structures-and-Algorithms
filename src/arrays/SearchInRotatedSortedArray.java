package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Leetcode-33
public class SearchInRotatedSortedArray {

  public static void main(String[] args) {
    int[] nums = {3,1};
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Enter a number to find in RotatedSortedArray " + Arrays.toString(nums) + ": ");
    int target = scanner.nextInt();
    System.out.println(search(nums, target));
  }

  static int search(int[] nums, int target) {
    int low = 0, high = nums.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (target == nums[mid]) {
        return mid;
        //left sorted portion
      } else if (nums[low] <= nums[mid]) {
        if (target >= nums[low] && target < nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
        //right sorted portion
      } else {
        if (target > nums[mid] && target <= nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }
}
