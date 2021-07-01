package random;

public class StairCase {
	//print staircase for n
  public static void main(String[] args) {
	  int n = 6;
	  printStaircase1(n);
	  printStaircase2(n);
  }

	private static void printStaircase2(int n) {

  	String str = "#";
    for (int i = 0; i < n ;i++) {
      System.out.printf("%"  + n + "s\n", str);
      str += "#";
    }
   // System.out.println("One Loop");
    //System.out.println(str);
	}

	private static void printStaircase1(int n) {
     StringBuilder str = new StringBuilder();
    for (int i = 0; i <= n; i++) {
      for (int j = n - i; j >= 0 ; j--) {
        str.append(" ");
	  }
      for (int j = 0; j < i; j++) {
		  str.append("#");
      }
      str.append("\n");

    }
		System.out.println("Multiple Loop");
    System.out.println(str);
  }
}
