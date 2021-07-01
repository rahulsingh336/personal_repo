package ds.string;

public class FindFirstRepeatingCharacter {

	//given below string find first repeating character
	//For ex:- geeksforgeeks o/p g
	//Another example:- abcbc o/p b
	//else return -1
  public static void main(String[] args) {
	  String geek = "gegeksforgeeks";
	  String abc = "abcbc";
	  String noRepeatingChar = "abcdef";

    //System.out.println(findFirstRepeatingCharacter(geek));
    //System.out.println(findFirstRepeatingCharacter(abc));
    //System.out.println(findFirstRepeatingCharacter(noRepeatingChar));
    System.out.println(findFirstRepeatingCharacter("abcfdeacf"));
  }

	private static char findFirstRepeatingCharacter(String geek) {
  	   int[] c = new int[256];

  	   char[] geekChar = geek.toCharArray();
       for (int i = 0; i < geekChar.length; i++) {
        if(c[geekChar[i]] == 1) return geekChar[i];
       	c[geekChar[i]] += 1;
	   }
		return (char) -1;
	}
}
