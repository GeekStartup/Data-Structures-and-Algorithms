import java.util.Scanner;

public class CountDigits {

  static int countDigits(int n) {
    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to count digits: ");
    int n = scanner.nextInt();
    System.out.println("Number of digits in " + n + " is: " + countDigits(n));
  }

}
