import java.util.*;

public class SubString {

  public static void main(String[] args) {
	  String str = "aabacbebebe";
	  generateSubString(str, 3);
  }

  public static void generateSubString(String str, int n) {
   Map m = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
		String inside = "";
		inside = inside+""+str.charAt(i);
		System.out.println(str.charAt(i));
      for (int j = ++i; j < str.length(); j++) {
		  //String x = str = str + str.charAt(i);
		  inside = inside + str.charAt(j);
		  System.out.println(inside);
      }
		int i1 = countUniqueCharacters(inside);
		if (n == i1){
			m.put(i1, inside);
		}
    }
    System.out.println("");
  }
	public static int countUniqueCharacters(String input) {
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
		for (int i = 0; i < input.length(); i++) {
			isItThere[input.charAt(i)] = true;
		}

		int count = 0;
		for (int i = 0; i < isItThere.length; i++) {
			if (isItThere[i] == true){
				count++;
			}
		}

		return count;
	}
}
