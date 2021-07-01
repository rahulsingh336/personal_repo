package random;

import java.util.Arrays;

public class BirthDaycake {

	// find number of candles or number highest one
  public static void main(String[] args) {
	  int[] arr = {3, 2, 1, 3, 4};

	  birthDayCakeCandles(arr);
  }

	private static void birthDayCakeCandles(int[] arr) {
		Arrays.sort(arr);

	int longestcandle = arr[arr.length - 1];
	int count = 0;
    for (int i = arr.length-2; i <= 0; i--) {
     		if (arr[i] == longestcandle) {
     			count++;
			} else {
     			break;
			}
    }

    System.out.println(longestcandle);
  }


}
