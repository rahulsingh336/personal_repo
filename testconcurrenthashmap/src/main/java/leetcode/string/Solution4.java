package leetcode.string;

import java.util.Arrays;

public class Solution4 {

  public static void main(String[] args) {
	  String s = "anagram";
	  String t = "nagaram";
    System.out.println(isAnagram(s ,t));
  }

	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

		char[] a = s.toCharArray();
		Arrays.sort(a);
		char[] a1 = t.toCharArray();
		Arrays.sort(a1);
		return Arrays.equals(a, a1);

	}
}
