package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DynamicBackTracking {

  public static void main(String[] args) {
	  //
	  int[] input = {1,2, 3};
   permutation(input, new ArrayList<>(), new boolean[3] );
	  /*int[] input1 = {3,2,5,8};
      combination(input1, 3,new LinkedHashSet <>(), 0);*/
  }


  public static void combination(int[] input, int k,
								 LinkedHashSet<Integer> set, int start){

    if(set.size() == k) {
		System.out.println(set);
		return;
	}

	  /*if(start == input.length){
		  return;
	  }*/

	  for (int i = start; i < input.length; i++) {
      set.add(input[i]);
      combination(input, k, set, i + 1 );
      set.remove(input[i]);
	}
  }

  public static void permutation( int[] input, ArrayList<Integer>
		  partial, boolean[] used ){

  	   if (partial.size() == input.length) {
		   System.out.println(Arrays.toString(partial.toArray()));
		   return;
	   }

		for (int i = 0; i < input.length; i++) {
      if (!used[i]) {
        used[i] = true;
        partial.add(input[i]);
        permutation(input, partial, used);
        // partial.remove(input[i]);
        partial.remove(partial.size() - 1);
        used[i] = false;
}
		}
  }
}
