package random;

public class DiagonalDifference {

  public static void main(String[] args) {
	  int[][] arr = {{1,2,3}, {4,5,6}, {9,8,9}};
	  findDiagonalDifference(arr);
  }

	private static void findDiagonalDifference(int[][] arr) {
	int leftSum = 0;
	int rightSum = 0;
    for (int i = 0; i < arr.length; i++) {
		leftSum += arr[i][i];
		rightSum += arr[i][(arr.length -1) - i];
    }
    System.out.println(Math.abs(rightSum - leftSum));
	}
}
