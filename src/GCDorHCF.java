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
  }

  static int bruteForceGCDorHCF(int num1, int num2) {
    int min = Math.min(num1, num2);
    for (int i = min; i >= 1; i--) {
      if (num1 % i == 0 && num2 % i == 0) {
        return i;
      }
    }
    return 1;
  }

}
