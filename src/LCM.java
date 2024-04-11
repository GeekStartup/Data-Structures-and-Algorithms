import java.util.Scanner;

public class LCM {

  public static void main(String[] args) {
    System.out.println("Enter 2 numbers to find LCM");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = Math.abs(scanner.nextInt());
    System.out.println("Enter second number:");
    int num2 = Math.abs(scanner.nextInt());
    if (num1 == 0 || num2 == 0) {
      System.out.println("Error! Both numbers should be non-zero.");
      return;
    }
    System.out.println(
        "LCM of " + num1 + " and " + num2 + " using optimised method is: " + optimizedLCM(num1,
            num2));
    System.out.println(
        "LCM of " + num1 + " and " + num2 + " using brute force is: " + bruteForceLCM(num1,
            num2));
  }

  //O(num1*num2 - max(num1,num2))
  static int bruteForceLCM(int num1, int num2) {
    long startTime = System.currentTimeMillis();
    int res = Math.max(num1, num2);
    while (true) {
      if (res % num1 == 0 && res % num2 == 0) {
        break;
      }
      res++;
    }
    long endTime = System.currentTimeMillis();
    System.out.println("\nTime taken by brute force method : " + (endTime - startTime) + " ms");
    return res;
  }

  //O(log(min(num1,num2))
  static int optimizedLCM(int num1, int num2) {
    long startTime = System.currentTimeMillis();
    long endTime = System.currentTimeMillis();
    System.out.println("\nTime taken by optimised method : " + (endTime - startTime) + " ms");
    return (num1 * num2) / gabrielLameGCDorHCF(num1, num2);
  }

  static int gabrielLameGCDorHCF(int num1, int num2) {
    while (num1 != 0 && num2 != 0) {
      if (num1 > num2) {
        num1 = num1 % num2;
      } else {
        num2 = num2 % num1;
      }
    }
    return Math.max(num1, num2);
  }

}
