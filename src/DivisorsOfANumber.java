import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfANumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find its divisors:");
    int num = scanner.nextInt();
    System.out.println("Divisors of " + num + " are (Brute Force): " + findDivisorsBruteForce(num));
    System.out.println(
        "Divisors of " + num + " are (Efficient Method): " + findDivisorsEfficient(num));
    System.out.println(
        "Divisors of " + num + " are (Efficient Method-Ascending): "
            + findDivisorsEfficientAscending(num));
  }

  //O(n)
  static List<Integer> findDivisorsBruteForce(int num) {
    long startTime = System.currentTimeMillis();
    List<Integer> divisors = new ArrayList<>(Arrays.asList(1, num));
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        divisors.add(i);
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by Brute Force method : " + (endTime - startTime) + " ms");
    return divisors;
  }

  //O(sqrt(n))
  static List<Integer> findDivisorsEfficient(int num) {
    long startTime = System.currentTimeMillis();
    List<Integer> divisors = new ArrayList<>(Arrays.asList(1, num));
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        divisors.add(i);
        if (i != num / i) {
          divisors.add(num / i);
        }
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by Efficient method : " + (endTime - startTime) + " ms");
    return divisors;
  }

  //O(sqrt(n))
  static List<Integer> findDivisorsEfficientAscending(int num) {
    long startTime = System.currentTimeMillis();
    List<Integer> divisors = new ArrayList<>();
    int i;

    for (i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        divisors.add(i);
      }
    }

    for (; i >= 1; i--) {
      if (num % i == 0 && i != num / i) {
        divisors.add(num / i);
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by Efficient method : " + (endTime - startTime) + " ms");
    return divisors;
  }

}
