package ds.recursion;

public class RecursiveFunctionToWriteOnetoNSeparateLine {
  public static void main(String[] args) {
    print(2);
  }

  public static void print(int n){
  	if(n == 0) return ;
  	 print(n - 1);
  	 System.out.println("  " + n);
	}
}

// Takes n as input and print from 1 to n
