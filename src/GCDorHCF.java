import java.util.Scanner;

public class GCDorHCF {

  public static void main(String[] args) {
    System.out.println("Enter 2 numbers to find GCD");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter second number:");
    int num2 = scanner.nextInt();
    System.out.println(
        "GCD/HCF of " + num1 + " and " + num2 + " using brute force is: " + bruteForceGCDorHCF(num1,
            num2));
    System.out.println(
        "GCD/HCF of " + num1 + " and " + num2 + " using Euclid algorithm is: " + euclidGCDorHCF(
            num1,
            num2));
  }

  //Brute Force
  static int bruteForceGCDorHCF(int num1, int num2) {
    long startTime = System.currentTimeMillis();
    long endTime;
    int min = Math.min(num1, num2);
    for (int i = min; i >= 1; i--) {
      if (num1 % i == 0 && num2 % i == 0) {
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by brute force : " + (endTime - startTime) + " ms");
        return i;
      }
    }
    endTime = System.currentTimeMillis();
    System.out.println("Time taken by brute force : " + (endTime - startTime) + " ms");
    return 1;
  }

  //Euclid
  static int euclidGCDorHCF(int num1, int num2) {
    long startTime = System.currentTimeMillis();
    while (num1 != num2) {
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken by Euclid algorithm : " + (endTime - startTime) + " ms");
    return num1;
  }

}
