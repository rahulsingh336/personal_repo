package initilizationsequence;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String inputString = scanner.nextLine();
      System.out.println(inputString);
      char[] temp = inputString.toCharArray();
    reverseString(temp);
    System.out.println(temp);
    //System.out.println(reverseString(inputString.toCharArray()));

  }
	public static void reverseString(char[] s) {
		int forwardDirectionPointer = 0, reverseDirectionPointer = s.length;
		char tempHolder;
		for (int i = 0; i < s.length; i++) {
			if(s.length % 2 == (reverseDirectionPointer - forwardDirectionPointer)) break;
			tempHolder = s[forwardDirectionPointer];
			s[i] = s[reverseDirectionPointer-1];
			s[reverseDirectionPointer-1] = tempHolder;
			forwardDirectionPointer++; reverseDirectionPointer--;
		}
	}
}
