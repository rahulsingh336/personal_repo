package amdocs;

import java.util.stream.Stream;

public class Java8Example {

  public static void main(String[] args) {
	  // Creating a Stream of Strings
	  Stream<String> stream = Stream.of("geeks", "for",
			  "geEKSQUIZ", "geeksforGeeks");

	  // Check if Character at 1st index is
	  // UpperCase in any string or not using
	  // Stream anyMatch(Predicate predicate)
	  boolean answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

	  // Displaying the result
	  System.out.println(answer);
  }
}
