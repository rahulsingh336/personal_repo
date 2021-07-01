package leetcode.string;

public class Solution1 {
  public static void main(String[] args) {
	  //char[] s = {'h','e','l','l','o'};
	  char[] s = {'H','a','n','n','a','h'};
	  reverseString(s);
    System.out.println(s);
  }

	public static void reverseString(char[] s) {
  	    int forwardDirectionPointer = 0, reverseDirectionPointer = s.length;
  	    char tempHolder;
		for (int i = 0; i < s.length; i++) {
			if(s.length % 2 == (reverseDirectionPointer - forwardDirectionPointer)) break;
			tempHolder = s[forwardDirectionPointer];
		    s[i] = s[reverseDirectionPointer-1];
		    s[reverseDirectionPointer-1] = tempHolder;
		    forwardDirectionPointer++; reverseDirectionPointer--;
		}
	}
}

//'h','e','l','l','o'
//o,l,l,e,h
//'H','a','n','n','a','h'
//hannah
//hannaH
