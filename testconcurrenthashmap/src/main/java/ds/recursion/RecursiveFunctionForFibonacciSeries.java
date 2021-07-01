package ds.recursion;

public class RecursiveFunctionForFibonacciSeries {

  public static void main(String[] args) {
	 System.out.println(findFibonacciSeries(4));
  }
// 0, 1, 1, 2, 3, 5
	private static int findFibonacciSeries(int i) {

  	if(i ==0 || i ==1) {
  		return i;
	}

		int fibonacciSeries = findFibonacciSeries(i - 1);
		int fibonacciSeries1 = findFibonacciSeries(i - 2);
		System.out.println(fibonacciSeries);
		System.out.println(fibonacciSeries1);
		int i1 = fibonacciSeries + fibonacciSeries1;
    System.out.println(i1);
		return i1;
	}
}
