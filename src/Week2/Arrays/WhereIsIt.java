// http://programmingbydoing.com/a/where-is-it.html
package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
  private final static int ARRAY_LENGTH = 10;
  private final static Random RAND = new Random();
  private final static Scanner STDIN_SCANNER = new Scanner(System.in);
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void main(String[] args) {
    int[] arr = new int[ARRAY_LENGTH];
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr[i] = RAND.nextInt(50) + 1;
    }

    printIntArray(arr, "Array");

    int target = askUserInputNumber("Value to find");

    System.out.println();

    boolean found = false;
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      if (arr[i] == target) {
        found = true;
        System.out.printf("%d is in slot %d.\n", target, i);
      }
    }
    if (!found) {
      System.out.printf("%d is not in the array.\n", target);
    }
  }

  private static int askUserInputNumber(String msg) {
    int number = 0;
    boolean succeeded = false;
    while(!succeeded) {
      System.out.printf("%s: ", msg);
      System.out.print(ANSI_GREEN);
      try {
        String input = STDIN_SCANNER.nextLine();
        number = Integer.valueOf(input);
        succeeded = true;
      }
      catch (Exception e) {
      }
      System.out.print(ANSI_RESET);
    }
    return number;
  }

  private static void printIntArray(int[] arr, String name) {
    System.out.printf("%s:", name);
    for (int num: arr) {
      System.out.printf(" %d", num);
    }
    System.out.println();
  }
}
