package leetcode.arrays;

public class Solution1 {

  public static void main(String[] args) {
	  int[] ints = {1, 1, 2};
	  //int[] ints = {0,0,1,1,1,2,2,3,3,4};
	  //int[] ints = {0,0};
	  int x = removeDuplicates(ints);
	  System.out.println(x);

	  // any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
	  for (int i = 0; i < x; i++) {
		  System.out.print(ints[i]);
	  }
  }

	private static int removeDuplicates(int[] nums) {

  	    if (nums.length<=1) return nums.length;

  	    int currUniqueElement = nums[0];
  	    int count = 1;
		for (int i = 1; i < nums.length;i++) {
		  if(nums[i] != currUniqueElement){
		  	currUniqueElement = nums[i];
		  	nums[count] = nums[i];
		  	count++;
		  }
		}
		return count;

	}
}
