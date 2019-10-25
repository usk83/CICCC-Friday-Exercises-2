// http://programmingbydoing.com/a/copying-arrays.html
package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
  private final static int ARRAY_LENGTH = 10;
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    int[] arr1 = new int[ARRAY_LENGTH];
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr1[i] = RAND.nextInt(100) + 1;
    }
    int[] arr2 = new int[ARRAY_LENGTH];
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr2[i] = arr1[i];
    }

    arr1[ARRAY_LENGTH - 1] = -7;

    printIntArray(arr1, "Array 1");
    printIntArray(arr2, "Array 2");
  }

  private static void printIntArray(int[] arr, String name) {
    System.out.printf("%s:", name);
    for (int num: arr) {
      System.out.printf(" %d", num);
    }
    System.out.println();
  }
}
