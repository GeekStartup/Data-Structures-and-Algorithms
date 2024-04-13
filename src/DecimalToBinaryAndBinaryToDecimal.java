import java.util.Scanner;

public class DecimalToBinaryAndBinaryToDecimal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scanner.nextInt();
    String binary = getBinary(num);
    System.out.println("Binary of " + num + ": " + binary);
    System.out.println("Decimal of " + binary + ": " + getDecimal(binary));
  }
  static String getBinary(int num) {
    String binary = "";
    while (num >= 1) {
      int reminder = num % 2;
      num = num / 2;
      binary = String.format("%d%s", reminder, binary);
    }
    return binary;
  }

  static int getDecimal(String binary) {
    int decimal = 0;
    int powOf2 = 1;

    for (int i = binary.length() - 1; i >= 0; i--) {
      if (binary.charAt(i) == '1') {
        decimal = decimal + powOf2;
      }
      powOf2 = powOf2 * 2;
    }
    return decimal;
  }

}
