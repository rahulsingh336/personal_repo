package random;

public class CheckNumOfOne {

  public static void main(String[] args) {
    System.out.println(countBits(5));
  }
	public static int countBits(int number) {
  	if (number == 0) {
  		return number;
  	}
  	int count = 0;
  	while (number != 0) {
		System.out.println(number);
		number &= (number - 1);
  		count++;
  	}
  	return count;
  }


}
