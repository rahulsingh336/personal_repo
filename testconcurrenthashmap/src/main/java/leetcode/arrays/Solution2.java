package leetcode.arrays;

public class Solution2 {

  public static void main(String[] args) {
	  int[] prices = {7,1,5,3,6,4};
	  //int[] prices = {1,2,3,4,5};
	  //int[] prices = {7,6,4,3,1};
	  //int[] prices = {7,6,4,3,1};
      System.out.println(maxProfit(prices));
  }

	private static int maxProfit(int[] prices) {
        int profit = 0;
        int currentValue = prices[0];
		for (int i = 1; i < prices.length; i++) {
		    if(prices[i] > currentValue) {
		    	profit += (prices[i] - currentValue);
		    	currentValue = prices[i];
			} else {
		    	currentValue = prices[i];
			}
		}
		return profit;
	}
}
