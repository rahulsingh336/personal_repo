package random;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StringPallendrome {

	//string to find palendrome
  public static void main(String[] args) {

  	  //String testString = "abca"; //abccba
  	  String testString = "abcba"; //abccba
    // abccba
    // System.out.println(isPallendrome(testString, 0, testString.length()));
	  DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("H:mm:ss.SSS");
    System.out.println(timeFormat);
	 /* List<?> list = new ArrayList<>();
	  List<? super Number> list1 = new ArrayList<>();
	  List<? extends Number> list2 = new ArrayList<>();
	  list.add(12);
	  list1.add(12);
	  list2.add(new Integer(12));*/
  }

	private static boolean isPallendrome(String testString, int start, int end) {

  	   if(testString.length() <= 1){
  	   	return true;
	   }

  	   if (testString.charAt(start) == testString.charAt(end - 1)){
		   String substring = testString.substring(start + 1, end - 1);
		   return isPallendrome(substring, 0, substring.length());
	   } else {
  	   	return false;
	   }

	}
}
