package ds.recursion;

public class RecursiveFunctionToWriteNtoOneSeparateLine {
  public static void main(String[] args) {
    System.out.println(print(5));
  }

  public static String print(int n){
  	if(n == 1) return "1";
    System.out.println(n + "  ");
  	return print(n - 1);
	}
}

// Takes n as input and print from n to 1
// base case can be 1