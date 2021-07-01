package leetcode.dp;

public class Solution2 {

  public static void main(String[] args) {
	  //int[] prices = {7,1,5,3,6,4};
	  //int[] prices = {3,3};
	  int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
	  //int[] prices = {2,2,5};
	  //int[] prices = {1,2,3,4,5};
	  //int[] prices = {7,6,4,3,1};
	  //int[] prices = {7,6,4,3,1};
	  System.out.println(maxProfit(prices));
  }

	public static int maxProfit(int[] prices) {
		int profit = 0;
		int slowPointer = 0, fastPointer = 1;
		/*if (prices.length == 2) {
			if (prices[0] < prices[1]){
				return prices[1] - prices[0];
			} else return 0;
		}*/
		while(fastPointer < prices.length){
			if (prices[slowPointer] >= prices[fastPointer]) {
				slowPointer = fastPointer;
				fastPointer++;
			} else if (prices[slowPointer] <= prices[fastPointer]) {
				int tempProfit = prices[fastPointer] - prices[slowPointer];
				profit = tempProfit > profit ? tempProfit : profit;
				fastPointer++;
			}
		}
		return profit;
	}
}
