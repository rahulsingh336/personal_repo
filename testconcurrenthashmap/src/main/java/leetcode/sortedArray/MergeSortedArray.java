package leetcode.sortedArray;

import java.util.Arrays;

public class MergeSortedArray {

  public static void main(String[] args) {
	  //int[] nums1 = {1,2,3,0,0,0};
	  //int[] nums1 = {2,0};
	  //int[] nums1 = {-1,0,0,3,3,3,0,0,0};
	  int[] nums1 = {1,2,3,0,0,0};
	  int m = 3;
	  int[] nums2 = {2,5,6};
	  int n = 3;
	  merge(nums1, m, nums2, n);
    Arrays.stream(nums1).forEach(System.out::println);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {

  	int j = 0;
	  if (n == 0) {
  		return;
  	}
    for (int i = 0; i < nums1.length && j < nums2.length; i++) {
		if (nums1[i] >= nums2[j]) {
			int z = i;
			pushElementByOne(nums1, z);
			nums1[i] = nums2[j];
			j++;
			n--;
		} /*else if (nums1[i] == 0){
			a = i;
			break;
		} */else {
			continue;
		}
	}
    if (n != 0) {
      for (int b = (nums1.length-n); b < nums1.length && j < nums2.length; b++) {
        nums1[b] = nums2[j];
        j++;
	  }
	}
  }

	private static void pushElementByOne(int[] nums1, int z) {
		int tmp = nums1[z];
    for (int i = z + 1 ; i< nums1.length; i++) {
		int tempNextNum = nums1[i];
		nums1[i] = tmp;
		tmp = tempNextNum;
    }
	}
}
