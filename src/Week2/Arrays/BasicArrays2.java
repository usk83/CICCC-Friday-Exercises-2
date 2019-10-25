// http://programmingbydoing.com/a/basic-arrays-2.html
package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
  private final static int ARRAY_LENGTH= 10;
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    int[] arr = new int[ARRAY_LENGTH];

    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr[i] = RAND.nextInt(100) + 1;
    }

    for (int i = 0; i < ARRAY_LENGTH; i++) {
      System.out.printf("Slot %d contains a %d\n", i, arr[i]);
    }
  }
}
