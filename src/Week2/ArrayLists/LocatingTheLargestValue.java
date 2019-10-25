// http://programmingbydoing.com/a/locating-the-largest-value-in-an-arraylist.html
package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
  private final static int ARRAY_LENGTH = 10;
  private final static int MAX_NUMBER = 100;
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(ARRAY_LENGTH);
    for(int i = ARRAY_LENGTH; i > 0; i--) {
      arrayList.add(RAND.nextInt(MAX_NUMBER) + 1);
    }
    printArrayList(arrayList, "ArrayList");

    int maxPosition = 0;
    int max = arrayList.get(maxPosition);
    int size = arrayList.size(); // actually, it's ARRAY_LENGTH
    for (int i = 1; i < size; i++) {
      int current = arrayList.get(i);
      if (max < current) {
        maxPosition = i;
        max = current;
      }
    }

    System.out.printf("\nThe largest value is %d, which is in slot %d\n", max, maxPosition);
  }

  private static void printArrayList(ArrayList<?> arrayList, String name) {
    System.out.printf( "%s: %s\n", name, arrayList );
  }
}
