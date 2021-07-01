public class SubStringTest {

	public void g(int x, long y){

	}

	public void g(long x, int y){

	}

	public int indexOf(String input, String subString){

		if(subString.length() ==0) return -1;

		char[] inputArray = input.toCharArray();
		int count = 0;
		int startPoint = 0;
		for (int i = 0; i< inputArray.length; i++) {
			if(inputArray[i] == subString.charAt(count)) {
				count++;
				startPoint = i;
				for(int j = ++i; j < subString.length(); j++) {
					if(inputArray[i] == subString.charAt(count)){
						continue;
					} else {
						break;
					}
				}
				return startPoint;
			}
		}
		return -1;
	}
}

//abcd
//cd
