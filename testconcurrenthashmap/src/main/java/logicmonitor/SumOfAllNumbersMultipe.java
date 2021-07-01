package logicmonitor;

import java.util.stream.IntStream;

public class SumOfAllNumbersMultipe {

	/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.*/
  public static void main(String[] args) {
    System.out.println(solution(10));
  }

	public static int solution(int number) {
		int totalSum = 0;
		int totalSumThree = 0;
		int totalSumFive = 0;
		for (int i=0; i < number; i++) {
			if (i % 3 == 0 ) {
				totalSumThree = totalSumThree + i;
			} else if (i % 5 == 0) {
				totalSumFive = totalSumFive + i;
			}
		}
		totalSum = totalSumThree + totalSumFive;
		/**return IntStream.range(0, number).filter(value -> {
		 if (value % 3 == 0 ) {
		 return true;
		 } else return value % 5 == 0;
		 }).reduce(0, Integer::sum);**/

		return totalSum;
	}
}
