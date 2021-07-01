package random;

import java.util.Arrays;

public class MiMacSum {

	//given array print min and max sum  using 4 of five integers
  public static void main(String[] args) {
	  //int[] arr = {1, 3, 9, 7, 5};
	  int[] arr = {1, 2, 5, 4, 3};
	  printSum1(arr);
	  printSum2(arr);
  }

	private static void printSum2(int[] arr) {

  	 long sum  = 0, min = 0, max = 0;
  	 Arrays.sort(arr);
  	 min = arr[0];
  	 max = arr[arr.length-1];

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
	}
    System.out.println("Solution1 1");
    System.out.println(sum - min);
    System.out.println(sum - max);
	}

	private static void printSum1(int[] arr) {

    Arrays.sort(arr);
    int minSum = 0;
    for (int i = 0; i < 4; i++) {
      minSum += arr[i];
	}

    int maxSum = 0;
	for (int i = arr.length-1; i > 0; i--) {
			maxSum += arr[i];
	}
	System.out.println("Solution1 2");
    System.out.println(minSum);
    System.out.println(maxSum);
	}
}
