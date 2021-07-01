package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution6 {

  public static void main(String[] args) {
	  //int[] nums1 = {1,2,2,1};
	  //int[] nums2 = {2,2};
	  //int[] nums1 = {4,9,5};
	  //int[] nums2 = {9,4,9,8,4};
	  //int[] nums1 = {3,1,2};
	  //int[] nums2 = {1,1};
	  int[] nums1 = {61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81};
	  int[] nums2 = {5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48};
	  Arrays.sort(nums1);
	  Arrays.sort(nums2);
	  //1,1,2,2
	  //2,2
	  //
	  //4589
	  //44899
	  //4
	  int[] intersect = intersect(nums1, nums2);
    for (int i : intersect) {
      System.out.println(i);
    }
  }

	public static int[] intersect(int[] nums1, int[] nums2) {

  	    int m = 0,n = 0;
  	    List<Integer> tempList = new ArrayList<>();

  	    while (m < nums1.length && n < nums2.length) {
  	    	if(nums1[m] < nums2[n]){
  	    		m++;
			} else if(nums1[m] > nums2[n]) {
  	    		n++;
			} else {
				tempList.add(nums1[m]);
  	    		m++;
  	    		n++;
			}
		}
  	    return tempList.stream().mapToInt(i->i).toArray();
	}
}
//1,1,2,2
//2,2

// 1 1 2 2
//2 2
