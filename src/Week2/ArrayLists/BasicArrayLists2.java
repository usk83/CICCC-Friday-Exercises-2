// http://programmingbydoing.com/a/basic-arraylists-2.html
package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
  private final static int ARRAY_LENGTH = 10;
  private final static int MAX_NUMBER = 100;
  private final static Random RAND = new Random();

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(ARRAY_LENGTH);
    for (int i = ARRAY_LENGTH; i > 0; i--) {
      arrayList.add(RAND.nextInt(MAX_NUMBER) + 1);
    }
    printArrayList(arrayList, "ArrayList");
  }

  private static void printArrayList(ArrayList<?> arrayList, String name) {
    System.out.printf("%s: %s\n", name, arrayList);
  }
}
