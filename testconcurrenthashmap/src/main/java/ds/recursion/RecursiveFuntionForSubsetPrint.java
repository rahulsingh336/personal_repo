package ds.recursion;

public class RecursiveFuntionForSubsetPrint {

  public static void main(String[] args) {
	  String strInput = "ABC";
	  printSubset(strInput, "", 0);
  }

	private static void printSubset(String original, String currentElement, int index) {
		if(original.length() == index){
			System.out.println(currentElement);
			return;
		}
		printSubset(original, currentElement, index+1);
		printSubset(original, currentElement+original.charAt(index), index+1);
	}
}

// Original String, index and current element
