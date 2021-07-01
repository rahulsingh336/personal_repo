package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {

	//string reverse using recursion
  public static void main(String[] args) {
	  //String str = "abcd";
	  String str = "abc";
    System.out.println(reverseRecursively(str));
  }

	private static String reverseRecursively(String str) {

  	if (str.length() < 1) {
  		return str;
	}


	return reverseRecursively(str.substring(1)) + str.charAt(0);

	}


}
