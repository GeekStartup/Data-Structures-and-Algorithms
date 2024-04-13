import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to find its prime factors:");
    int num = scanner.nextInt();
    System.out.println(
        "Prime factors of " + num + " is(Efficient): " + findPrimeFactorsEfficient(num));
    System.out.println(
        "Prime factors of " + num + " is(Inefficient): " + findPrimeFactorsInefficient(num));
  }


  //O(sqrt(num)log num)
  static List<Integer> findPrimeFactorsEfficient(int num) {
    List<Integer> primeFactors = new ArrayList<>();
    long startTime = System.currentTimeMillis();
    int i = 2;
    while (num >= i * i) {
      while (num % i == 0) {
        primeFactors.add(i);
        num = num / i;
      }
      i++;
    }
    if (num > 1) {
      primeFactors.add(num);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by efficient method: " + (endTime - startTime) + " ms");
    return primeFactors;
  }

  //Composite number - O(sqrt(num)log num)
  //Prime number - O(n)
  static List<Integer> findPrimeFactorsInefficient(int num) {
    List<Integer> primeFactors = new ArrayList<>();
    long startTime = System.currentTimeMillis();
    int i = 2;
    while (num > 1) {
      while (num % i == 0) {
        primeFactors.add(i);
        num = num / i;
      }
      i++;
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "\nTime taken by inefficient method: " + (endTime - startTime) + " ms");
    return primeFactors;
  }

}
