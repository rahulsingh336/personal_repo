package ds.search;

import java.util.Arrays;

public class BinarySearchTest {

	// Given below implement binary search alogo
	// int[] arr = {1, 5, 3, 8, 7, 10}
  public static void main(String[] args) {
	  int[] arr = {1, 8, 10};
	  int elementToBeSearchedNegative = 53;
	  int elementToBeSearchedPositive = 8;
    Arrays.sort(arr);
    System.out.println(search(arr, elementToBeSearchedNegative));
    System.out.println(search(arr, elementToBeSearchedPositive));
  }

	public static boolean search(int[] arr, int element) {
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
    System.out.println("mid point is" + "-> "+h);
  	       if (arr[h] == element) return true;
  	       else if( arr[h] < element){
			   binarySearch(arr, l, h-1, element);
		   }else {
			   binarySearch(arr, h+1, arr.length-1, element);
		   }
  	 return false;
	}
}
