// http://programmingbydoing.com/a/basic-arrays-2.html
package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    int[] arr = {
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100(),
      getRandomNumber1to100()
    };

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Slot %d contains a %d\n", i, arr[i]);
    }
  }

  private static int getRandomNumber1to100() {
    return RAND.nextInt(100) + 1;
  }
}
