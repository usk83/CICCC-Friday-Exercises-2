// http://programmingbydoing.com/a/locating-the-largest-value-in-an-array.html
package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
  private final static int ARRAY_LENGTH = 10;
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    int[] arr = new int[ARRAY_LENGTH];
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr[i] = RAND.nextInt(100) + 1;
    }

    printIntArray(arr, "Array");

    int maxPosition = 0;
    for (int i = 1; i < ARRAY_LENGTH; i++) {
      if (arr[maxPosition] < arr[i]) {
        maxPosition = i;
      }
    }

    System.out.printf("\nThe largest value is %d\n", arr[maxPosition]);
    System.out.printf("It is in slot %d\n", maxPosition);
  }

  private static void printIntArray(int[] arr, String name) {
    System.out.printf("%s:", name);
    for (int num: arr) {
      System.out.printf(" %d", num);
    }
    System.out.println();
  }
}
