package ds.recursion;

public class RecursiveFunctionToWriteOnetoN {
  public static void main(String[] args) {
    System.out.println(print(5));
  }

  public static String print(int n){
  	if(n == 1) return "1";
  	return print(n - 1)  + "  " + n;
	}
}

// Takes n as input and print from 1 to n
// base case can be 1