package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

  public static void main(String[] args) {
	  char[] input = "god".toCharArray();
	  analgrams(input, new ArrayList<>(), new boolean[3]);
  }

  static void analgrams(char[] input, List<String> partial, boolean[] used ){

  	    if (input.length == partial.size()) {
			System.out.println(Arrays.toString(partial.toArray()));
			return;
		}

    for (int i = 0; i < input.length; i++) {
    	//if(!used[i]){
		//used[i] = true;
    	partial.add(String.valueOf(input[i]));
    	analgrams(input, partial, used);
    	partial.remove(String.valueOf(input[i]));
		//used[i] = false;
 //   	}
    }
  }
}
