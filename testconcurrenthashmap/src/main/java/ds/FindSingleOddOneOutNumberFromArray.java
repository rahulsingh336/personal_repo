package ds;

public class FindSingleOddOneOutNumberFromArray {

  public static void main(String[] args) {
	  Integer[] arr = {-3, -3, 3, 4, 4, 6, 6};
	    int first = arr[0];
    for (int i = 1; i < arr.length; i++) {
    //  System.out.println(first+" - "+arr[i]);
		first = first ^ arr[i];
    //  System.out.println(first);
    }
    System.out.println(first);
  }
}
