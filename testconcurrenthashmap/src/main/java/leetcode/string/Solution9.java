package leetcode.string;

import java.util.Arrays;

public class Solution9 {
  public static void main(String[] args) {
	  //String[] strs = {"flower","flow","flight"};
	  //String[] strs = {"dog","racecar","car"};
	  //String[] strs = {"","",""};
	  String[] strs = {"cir","car"};
      System.out.println(longestCommonPrefix(strs));
  }

	public static String longestCommonPrefix(String[] strs) {
		int size = strs.length;

		/* if size is 0, return empty string */
		if (size == 0)
			return "";

		if (size == 1)
			return strs[0];
		/* sort the array of strings */
		Arrays.sort(strs);

		/* find the minimum length from first and last string */
		int end = Math.min(strs[0].length(), strs[size-1].length());
		int cnt = 0;
		boolean processFurther = false;
		if (end > 0) {
		if (strs[0].charAt(0) == strs[size-1].charAt(0)) {
			processFurther = true;
			cnt++;
		}
		if (processFurther) {
			for (int i = 1; i< end; i++) {
				if (strs[0].charAt(i) == strs[size-1].charAt(i)){
					cnt++;
				} else {
					break;
				}
			}
		} else {
			return "";
		}
		}else {
			return "";
		}

		return strs[0].substring(0, cnt);
	}
}
