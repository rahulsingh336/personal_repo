package leetcode.string;

public class Solution5 {

  public static void main(String[] args) {
   //String s = "A man, a plan, a canal: Panama";
   //String s = "aa";
   String s = "abba";
   System.out.println(isPalindrome(s));
  }

	public static boolean isPalindrome(String s) {

   int forwardDirectionCounter = 0, reverseDirectionCounter = s.length() - 1;

    while (forwardDirectionCounter <= reverseDirectionCounter){
    	if(forwardDirectionCounter == reverseDirectionCounter) return true;
    	if (Character.isLetterOrDigit(s.charAt(forwardDirectionCounter)) && Character.isLetterOrDigit(s.charAt(reverseDirectionCounter))){
    		char temp1 = Character.toLowerCase(s.charAt(forwardDirectionCounter));
    		char temp2 = Character.toLowerCase(s.charAt(reverseDirectionCounter));
    		if(temp1 == temp2){
    			forwardDirectionCounter++;
    			if (s.length()!=2)reverseDirectionCounter--;
    			if(forwardDirectionCounter > reverseDirectionCounter) return true;
    			continue;
			} else return false;
		} else if(!Character.isLetterOrDigit(s.charAt(forwardDirectionCounter))) {
    		forwardDirectionCounter++;
		} else if(!Character.isLetterOrDigit(s.charAt(reverseDirectionCounter))) {
    		reverseDirectionCounter--;
		}
	}
		return false;
	}
}

//amanaplanac
//analpanama