import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialIteration {

  private static int fact(int n) {

    /*for (int i = 1; i <= n; i++) {
      res *= i;
    }*/
    //int res = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Please enter a positive integer to find its factorial:");
    while (true) {
      // Check if the input is an integer
      if (scanner.hasNextInt()) {
        n = scanner.nextInt();
        // Check if the input is positive
        if (n >= 0) {
          break; // Exit loop if input is valid
        } else {
          System.out.println("Error! \nPlease enter a positive integer:");
        }
      } else {
        System.out.println("Error! \nPlease enter a valid integer:");
        scanner.next(); // Discard invalid input
      }
    }
    System.out.println("Factorial of " + n + " is: " + fact(n));
  }

}