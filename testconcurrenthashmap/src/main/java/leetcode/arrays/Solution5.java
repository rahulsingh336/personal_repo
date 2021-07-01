package leetcode.arrays;

import java.util.Arrays;

public class Solution5 {
  public static void main(String[] args) {
	  //int[] nums = {2,2,1};
	  //int[] nums = {4,1,2,1,2};
	  //int[] nums = {-1};
	  int[] nums = {1,0,1};
	  Arrays.sort(nums);
	  System.out.println(singleNumber(nums));
  }

	public static int singleNumber(int[] nums) {
  	if (nums.length<=1) return nums[0];
  	    int nextElement = nums[0];
		for (int i = 1; i < nums.length; i++) {
		  if(nextElement != nums[i]) return nextElement;
		  else {
		  	nextElement = nums[i+1];
		  	++i;
		  }
		}
		return nextElement;
	}
}
