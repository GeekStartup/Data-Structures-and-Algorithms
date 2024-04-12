import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scanner.nextInt();
    if (isPrimeNumberBruteForce(num)) {
      System.out.println(num + " is a prime number (Brute Force)");
    } else {
      System.out.println(num + " is a not prime number (Brute Force)");
    }

    if (isPrimeNumberEfficient(num)) {
      System.out.println(num + " is a prime number (Efficient)");
    } else {
      System.out.println(num + " is a not prime number (Efficient)");
    }

    if (isPrimeNumberMostEfficient(num)) {
      System.out.println(num + " is a prime number (Most Efficient)");
    } else {
      System.out.println(num + " is a not prime number (Most Efficient)");
    }

  }

  //O(n)
  static boolean isPrimeNumberBruteForce(int num) {
    long startTime = System.currentTimeMillis();
    long endTime;
    if (num == 1) {
      endTime = System.currentTimeMillis();
      System.out.println(
          "\nTime taken by brute force method : " + (endTime - startTime) + " ms");
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        endTime = System.currentTimeMillis();
        System.out.println("\nTime taken by brute force method : " + (endTime - startTime) + " ms");
        return false;
      }
    }
    endTime = System.currentTimeMillis();
    System.out.println("\nTime taken by brute force method : " + (endTime - startTime) + " ms");
    return true;
  }

  //O(Sqrt(n))
  static boolean isPrimeNumberEfficient(int num) {
    long startTime = System.currentTimeMillis();
    long endTime;
    if (num == 1) {
      endTime = System.currentTimeMillis();
      System.out.println(
          "\nTime taken by efficient method : " + (endTime - startTime) + " ms");
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        endTime = System.currentTimeMillis();
        System.out.println("\nTime taken by efficient method : " + (endTime - startTime) + " ms");
        return false;
      }
    }
    endTime = System.currentTimeMillis();
    System.out.println("\nTime taken by efficient method : " + (endTime - startTime) + " ms");
    return true;
  }

  //O(Sqrt(n))
  static boolean isPrimeNumberMostEfficient(int num) {
    long startTime = System.currentTimeMillis();
    long endTime;
    if (num == 1) {
      endTime = System.currentTimeMillis();
      System.out.println(
          "\nTime taken by most efficient method : " + (endTime - startTime) + " ms");
      return false;
    }
    if (num == 2 || num == 3) {
      endTime = System.currentTimeMillis();
      System.out.println(
          "\nTime taken by most efficient method : " + (endTime - startTime) + " ms");
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
      endTime = System.currentTimeMillis();
      System.out.println(
          "\nTime taken by most efficient method : " + (endTime - startTime) + " ms");
      return false;
    }
    for (int i = 5; i <= Math.sqrt(num); i += 6) {
      if (num % i == 0) {
        endTime = System.currentTimeMillis();
        System.out.println(
            "\nTime taken by most efficient method : " + (endTime - startTime) + " ms");
        return false;
      }
    }
    endTime = System.currentTimeMillis();
    System.out.println("\nTime taken by most efficient method : " + (endTime - startTime) + " ms");
    return true;
  }

}
