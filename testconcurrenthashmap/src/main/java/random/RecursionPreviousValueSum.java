package random;

import java.util.Arrays;

public class RecursionPreviousValueSum {

	// [1,2,3,4,5,6,7] == [1,3,6,10,15,21,28]
  public static void main(String[] args) {

  	int[] input = {1, 2, 3, 4, 5, 6, 7};
  	int length = input.length;
  	printPreviousSum(input, length, 0);
  }

	private static void printPreviousSum(int[] input, int length, int i) {

  	   if(length == 0) {
        System.out.println(Arrays.toString(input));
  	   	return;
	   }

  	   if(i == 0){
		   input[i] = input[i];
	   } else {
		   input[i] = input[i] + input[i-1];
	   }
  	   length--;
  	   printPreviousSum(input, length, i+1);

	}
}
