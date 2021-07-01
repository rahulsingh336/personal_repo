package leetcode.string;

public class Solution7 {
  public static void main(String[] args) {
    // String haystack = "hello";
    // String haystack = "aaaaa";
    // String haystack = "a";
    //String haystack = "mississippi";
    String haystack = "mississii";
	  //String needle = "ll";
	  //String needle = "bba";
	  //String needle = "a";
	  String needle = "issip";
	  //String needle = "";
      System.out.println(strStr(haystack, needle));
  }

	public static int strStr(String haystack, String needle) {
        if (needle.length() ==0) return 0;
        if (needle.length() >  haystack.length()) return -1;
		for (int i = 0; i < haystack.length(); i++) {
			int temp = 0;
			int lengthOfNeedle = needle.length();
			int hayStackLength = haystack.length();
			if (hayStackLength - i < lengthOfNeedle) return -1;
			char c = haystack.charAt(i);
			if (c == needle.charAt(temp)){
			 String substring = haystack.substring(i, i + lengthOfNeedle);
			 if( substring.equals(needle)){
				return i;
			}
		 }
		}
			return -1;
		}
}
