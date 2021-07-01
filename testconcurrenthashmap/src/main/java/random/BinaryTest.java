package random;

public class BinaryTest {

  public static void main(String[] args) {

		  String s = "7";
		  strToBinary(s);
  }

	// utility function
	static void strToBinary(String s)
	{
		int n = s.length();
        System.out.println(n);
		for (int i = 0; i < 1; i++)
		{
			// convert each char to
			// ASCII value
			int val = 17;

			// Convert ASCII value to binary
			System.out.println(val);
			String bin = "";
			while (val > 0)
			{
				if (val % 2 == 1)
				{
					bin += '1';
				}
				else
					bin += '0';
				val /= 2;
			}
			bin = reverse(bin);

			System.out.print(bin + " ");
		}
	}
	static String reverse(String input)
	{
		char[] a = input.toCharArray();
		int l, r = 0;
		r = a.length - 1;

		for (l = 0; l < r; l++, r--)
		{
			// Swap values of l and r
			char temp = a[l];
			a[l] = a[r];
			a[r] = temp;
		}
		return String.valueOf(a);
	}
}