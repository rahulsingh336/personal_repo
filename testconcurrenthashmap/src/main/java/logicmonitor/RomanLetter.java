package logicmonitor;

public class RomanLetter {

	/*Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

	Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.*/
	// This function returns
	// value of a Roman symbol
	int value(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	// Finds decimal value of a
	// given romal numeral
	int romanToDecimal(String str)
	{
		int res = 0;

		for (int i = 0; i < str.length(); i++)
		{
			int s1 = value(str.charAt(i));
			if (i + 1 < str.length())
			{
				int s2 = value(str.charAt(i + 1));
				if (s1 >= s2)
				{
					res = res + s1;
				}
				else
				{
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}

		return res;
	}

	// Driver Code
	public static void main(String args[])
	{
		RomanLetter ob = new RomanLetter();

		// Considering inputs given are valid
		String str = "MCMIV";
		System.out.println("Integer form of Roman Numeral"
				+ " is "
				+ ob.romanToDecimal(str));
	}
}
