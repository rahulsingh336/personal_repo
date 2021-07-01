package random;

import java.text.DecimalFormat;

public class PlusMinus {

   //find fraction of count if +ve, -ve and 0 numbers
  public static void main(String[] args) {
	  int[] arr = {-4, 3, -9, 0, 4, 1};
	  findFraction(arr);
  }

	private static void findFraction(int[] args) {

  	   float positiveCount = 0 , negativeCount = 0, zeroCount = 0;

		long length = args.length;

		for (int arg : args) {
			if (arg < 0) {
				negativeCount++;
			} else if (arg == 0) {
				zeroCount++;
			} else {
				positiveCount++;
			}
		}
    System.out.println(positiveCount);
    System.out.println(negativeCount);
    System.out.println(zeroCount);
		float x = positiveCount / length;
		System.out.println(x);
		float y = negativeCount / length;
		System.out.println(y);
		float z = zeroCount / length;
		System.out.println(z);
		DecimalFormat df = new DecimalFormat("0.000000");
		String x1 = df.format(x);
		System.out.println(x1);
		String y1 = df.format(y);
		System.out.println(y1);
		String z1 = df.format(z);
		//System.out.printf("%1.6 f\n", x);
		System.out.printf("%"  + 1.6 + "f\n", x);
    	System.out.printf("% 1.6 f\n", y);
    	//System.out.printf("%1.6 f\n", z);
	}
}
