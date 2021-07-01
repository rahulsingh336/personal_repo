package techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CandidateCode {

  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String virusComposition = scanner.next();
	  int numberOfPeople = scanner.nextInt();
	  List<String> bloodComposition = new ArrayList<>(numberOfPeople);
	  IntStream.range(0, numberOfPeople).forEach(value -> {
        bloodComposition.add(scanner.next());
	  });

	  scanner.close();
		bloodComposition.forEach(
			s -> {
			  if ((virusComposition.length() >= s.length()) && isSubSequence(virusComposition, s, virusComposition.length(), s.length())) {
				System.out.println("POSITIVE");
			  } else {
				  System.out.println("NEGATIVE");
			  }
			});
  }

	static boolean isSubSequence(String str1, String str2,
								 int m, int n)
	{
		int j = 0;
		for (int i = 0; i< m && j < n; i++) {
			if (str1.charAt(i) == str2.charAt(j)){
				j++;
			}
		}

		return (j == n);
	}
}
