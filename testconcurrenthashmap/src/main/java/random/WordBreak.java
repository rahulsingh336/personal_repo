package random;

import java.util.*;

public class WordBreak {

  public static void main(String[] args) {

	  Set<String> dict = new HashSet<String>();
	  dict.add("cat");
	  dict.add("cats");
	  dict.add("and");
	  dict.add("sand");
	  dict.add("dog");
	  String input = "catsanddog";
	  wordBreak(input, new ArrayList<>(), new boolean[input.length()], dict, 0);
  }

  static void wordBreak(String input, List<String> partialResult, boolean[] visited, Set<String> dict, int k) {

  	  if (input.length() == k) {
		  //System.out.println(Arrays.toString(partialResult.toArray()));
		  return;
	  }

    for (int i = k; k <= input.length(); k++) {

    	// check if input contains valid word and add to partial result
		String substring = input.substring(i, k);
		if(dict.contains(substring)){
        	partialResult.add(substring);
        	wordBreak(input, partialResult, visited, dict, k);
           System.out.println(substring);
           System.out.println(partialResult.get(partialResult.size() - 1));
			partialResult.remove(substring);
		}

	}
  }
}
