package ds.recursion;

public class TestRecursion {

  public static void main(String[] args) {
	  seeMethodCall("A", "B");
  }

	private static String seeMethodCall(String a, String b) {
        System.out.println(a +" - "+b);
    	return seeMethodCall("First", b) +" - "+ seeMethodCall("Second", b);
	}
}
