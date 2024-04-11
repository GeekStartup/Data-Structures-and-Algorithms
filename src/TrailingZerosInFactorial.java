import java.util.Scanner;

public class TrailingZerosInFactorial {

  static int countTrailingZeros(int num) {
    int count = 0;
    int powOf5 = 5;
    while (num >= powOf5) {
      count = count + (num / powOf5);
      powOf5 *= 5;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive number to compute the trailing zero in factorial:");
    int num;
    while (true) {
      if (scanner.hasNextInt()) {
        num = scanner.nextInt();
        if (num >= 0) {
          break;
        } else {
          System.out.println("Error! \nEnter a positive number:");
        }
      } else {
        System.out.println("Error! \nEnter a valid positive number:");
        scanner.next();
      }
    }
    System.out.println("Number of trailing zeros in " + num + "! is: " + countTrailingZeros(num));
  }
}
