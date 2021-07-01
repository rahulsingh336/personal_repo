package leetcode.arrays;

import java.util.Arrays;

public class Solution4 {

  public static void main(String[] args) {
	  int[] nums = {1,2,3,1};
	  Arrays.sort(nums);
    System.out.println(containsDuplicate(nums));
  }

	public static boolean containsDuplicate(int[] nums) {
  	int duplicateCheck = nums[0];
		for (int i = 1; i < nums.length; i++) {
          if (nums[i] == duplicateCheck) return true;
          else {
          	duplicateCheck = nums[i];
		  }
		}
		return false;
	}
}
