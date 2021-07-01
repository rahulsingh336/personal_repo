package ds.search;

import java.util.Arrays;

public class BreakBinarySearch {
  public static void main(String[] args) {
   // System.out.println(Integer.MAX_VALUE);
	  int i = Integer.MAX_VALUE - (Integer.MAX_VALUE / 4);
   // System.out.println(i);
    int y = i / 2;
   // System.out.println(y);
	  int x = (i + y) / 2;
	//  System.out.println(x);
   // System.out.println(i - x);
	  int[] test = new int[i];
	  test[y] = 336;
	  test[++y] = 337;
	  int inc = 337;
    for (int j = y; j < test.length - 1; j++) {
		test[++y] = ++ inc;
    }
    //System.out.println(test[test.length]);
    System.out.println(test[test.length -1]);
    System.out.println(test[test.length -2]);
	  //int[] arr = {1, 8, 10};
	  int elementToBeSearchedPositive = 340;
	  //Arrays.sort(test);
	  System.out.println(BinarySearchTest.search(test, elementToBeSearchedPositive));
  }
}
