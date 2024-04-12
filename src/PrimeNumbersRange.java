import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersRange {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find the prime numbers till that number:");
    int num = scanner.nextInt();

    System.out.println("Prime numbers till " + num + " are: " + primeNumberRangeBruteForce(num));
    System.out.println("Prime numbers till " + num + " are: " + eratosthenesSieveAlgorithm(num));
  }

  //O(sqrt(n)log(log(n)))
  static List<Integer> eratosthenesSieveAlgorithm(int num) {
    long startTime = System.currentTimeMillis();
    List<Integer> primeNumbers = new ArrayList<>();
    boolean[] isPrimes = new boolean[num + 1];
    Arrays.fill(isPrimes, true);
    for (int i = 2; i * i <= num; i++) {//Better optimized than for (int i = 2; i <= num; i++)
      if (isPrimes[i]) {
        for (int j = i * i; j <= num;
            j = j + i) {//Better optimized than  for (int j = i * 2; j <= num; j += i)
          isPrimes[j] = false;
        }
      }
    }

    for (int i = 2; i < isPrimes.length; i++) {
      if (isPrimes[i]) {
        primeNumbers.add(i);
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by Eratosthenes Sieve Algorithm method : " + (endTime - startTime) + " ms");
    return primeNumbers;
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
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }

}
