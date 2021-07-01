package leetcode.arrays;

public class Solution3 {
  public static void main(String[] args) {
	  //int[] nums = {1,2,3,4,5,6,7};
	  int[] nums = {1,2,3};
	  int k = 2;
	  rotate(nums, k);
    for (int num : nums) {
      System.out.println(num);
	}
  }

	private static void rotate(int[] nums, int k) {
  	    int nextElement = nums[0];
		for (int i = 0; i < k; i++) {
		  for (int j = 1;  j< nums.length; j++) {
			  int temp = nums[j];
			  nums[j] = nextElement;
			  nextElement = temp;
		  }
		}
		nums[0] = nextElement;
	}
}






