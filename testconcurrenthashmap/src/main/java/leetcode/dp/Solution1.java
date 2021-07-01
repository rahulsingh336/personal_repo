package leetcode.dp;

public class Solution1 {
  public static void main(String[] args) {
   int n = 1;
    System.out.println(climbStairs(n));
  }
	public static int climbStairs(int n) {
		// create an array of size `n+1` for storing solutions to the subproblems
		int[] lookup = new int[n + 1];

		// base case: 1 way (with no steps)
		lookup[0] = 1;

		// There is only 1 way to reach the 1st stair
		lookup[1] = 1;

		if (n > 1){
			// There are 2 ways to reach the 2nd stair
			lookup[2] = 2;
		}


		// fill the lookup table in a bottom-up manner
		for (int i = 3; i <= n; i++) {
			lookup[i] = lookup[i - 1] + lookup[i - 2];
		}

		return lookup[n];
	}
}
