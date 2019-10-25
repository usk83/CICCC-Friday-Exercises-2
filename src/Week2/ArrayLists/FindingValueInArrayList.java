// http://programmingbydoing.com/a/finding-a-value-in-an-arraylist.html
package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
  private final static int ARRAY_LENGTH = 10;
  private final static int MAX_NUMBER = 50;
  private final static Random RAND = new Random();
  private final static Scanner STDIN_SCANNER = new Scanner(System.in);
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(ARRAY_LENGTH);
    for(int i = ARRAY_LENGTH; i > 0; i--) {
      arrayList.add(RAND.nextInt(MAX_NUMBER) + 1);
    }
    printArrayList(arrayList, "ArrayList");

    int target = askUserInputNumber("Value to find");

    System.out.println();

    int size = arrayList.size(); // actually, it's ARRAY_LENGTH
    for (int i = 0; i < size; i++) {
      if (arrayList.get(i) == target) {
        System.out.printf("%d is in the ArrayList.\n", target);
      }
    }
  }

  private static void printArrayList(ArrayList<?> arrayList, String name) {
    System.out.printf( "%s: %s\n", name, arrayList );
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
}
