package ds.recursion;

public class RecursiveFunctionFactorial {
  public static void main(String[] args) {

    System.out.println(findFactorial(5));
  }

	private static int findFactorial(int i) {
  	if(i == 1){
  		return i;
	}
  	return i * findFactorial(i-1);
	}
}
