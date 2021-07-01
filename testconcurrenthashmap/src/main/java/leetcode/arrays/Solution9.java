package leetcode.arrays;

import java.util.Arrays;

public class Solution9 {

  public static void main(String[] args) {
    //int[] nums = {2,7,11,15};
    int[] nums = {3,2,4};
    int target = 6;
    Arrays.stream(twoSum(nums, target))
        .forEach(
				System.out::println);
  }

	public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
		int cnt = 0;
		while (cnt < nums.length) {
			int elementToBeSearched = target - nums[cnt];
			ret[0] = cnt;
			int b = search(nums, cnt + 1, elementToBeSearched);
			if(b != -1){
				ret[1] = b;
				break;
			} else {
				cnt++;
			}
		}
		return ret;
	}

	private static int search(int[] nums, int i, int elementToBeSearched) {
    for (int j = i; j <nums.length; j++) {
		if(nums[j] == elementToBeSearched) return j;
    }
		return -1;
	}
}
//2,7,11,15
//7,2,-2,-6
//3,2,4
//3,4,2
