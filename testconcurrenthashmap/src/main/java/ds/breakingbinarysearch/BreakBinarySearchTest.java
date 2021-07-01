package ds.breakingbinarysearch;

import java.util.Arrays;

public class BreakBinarySearchTest {

	// This is demo to break the binary search algo or bug

  public static void main(String[] args) {
	  int[] arr = new int[21474836*21474836 * 762786192];
	  int elementToBeSearched = 336;
    Arrays.stream(arr)
        .forEach(
            value -> {
				//System.out.println(value);
            });
	  int val1 = 9898989;
	  int val2 = 6789054;
	  System.out.println("Value1: "+val1);
	  System.out.println("Value2: "+val2);
	  long sum = (long)val1 + (long)val2;
    System.out.println(sum);
    System.out.println(new Integer((int) sum));
    System.out.println(Integer.MAX_VALUE);
    System.out.println(21474836*21474836 * 762786192);
    //Arrays.sort(arr);
    //System.out.println(search(arr, elementToBeSearchedNegative));
    //System.out.println(search(arr, elementToBeSearchedPositive));
  }

	private static boolean search(int[] arr, int element) {
			int l=0;
			int h=arr.length;
  	    return binarySearch(arr, l, h, element);
	}

	private static boolean binarySearch(int[] arr, int l, int h, int element) {

  	       if(l == h) return false;
  	       if(arr[l] == element || arr[h - 1] == element){
  	       	return true;
		   }
  	       h = (l+h)/2;
  	       if (arr[h] == element) return true;
  	       else if( arr[h] < element){
			   binarySearch(arr, l, h-1, element);
		   }else {
			   binarySearch(arr, h+1, arr.length-1, element);
		   }
  	 return false;
	}
}
