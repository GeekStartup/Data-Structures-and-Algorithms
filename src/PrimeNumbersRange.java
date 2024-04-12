import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersRange {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find the prime numbers till that number:");
    int num = scanner.nextInt();

    System.out.println("Prime numbers till " + num + " are: " + primeNumberRangeBruteForce(num));
  }

  //O(n * Sqrt(n))
  static List<Integer> primeNumberRangeBruteForce(int num) {
    long startTime = System.currentTimeMillis();
    List<Integer> primeNumbers = new ArrayList<>();
    for (int i = 2; i <= num; i++) {
      if (isPrimeNumberMostEfficient(i)) {
        primeNumbers.add(i);
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by brute force method : " + (endTime - startTime) + " ms");
    return primeNumbers;
  }

  //O(Sqrt(n))
  private static boolean isPrimeNumberMostEfficient(int num) {
    if (num == 1) {
      return false;
    }
    if (num == 2 || num == 3) {
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }
    for (int i = 5; i <= Math.sqrt(num); i += 6) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}
