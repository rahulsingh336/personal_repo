package leetcode.arrays;

import java.util.Arrays;

public class Solution8 {
  public static void main(String[] args) {
	  //int[] nums = {0,1,0,3, 0, 12};
	  //int[] nums = {1,0,1};
	  int[] nums = {1,2,3};
	  moveZeroes(nums);
    Arrays.stream(nums).forEach(System.out::println);
  }

	public static void moveZeroes(int[] nums) {

     if (nums.length != 0) {
     	  int slowPointer = 0, fastPointer = 1;
		  while (fastPointer < nums.length){
		  	if(nums[slowPointer] == 0 && nums[fastPointer] != 0){
		  		int temp = nums[fastPointer];
		  		nums[slowPointer] = temp;
		  		nums[fastPointer] = 0;
		  		slowPointer ++;
		  		fastPointer ++;
			} else if(nums[slowPointer] != 0 ){
                slowPointer++;
                fastPointer++;
			}else {
				fastPointer++;
			}
		  }
     }
	}
}

//0,1,0,3,12
//0,0,0,3,12
//1,0,1
//1,2,1





