package techgig;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CandidateCode1 {

  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int numberOfTestCases = Integer.valueOf(scanner.nextLine());
	  List<String> rangeList = new ArrayList<>(numberOfTestCases);
	  IntStream.range(0, numberOfTestCases).forEach(value -> {
		  rangeList.add(scanner.nextLine());
	  });

	  scanner.close();
    rangeList.forEach(
        s -> {
          String[] rangeArray = s.split("\\s");
          List<Integer> listOfPrimeNumbers = new ArrayList<Integer>();
          IntStream.rangeClosed(Integer.valueOf(rangeArray[0]), Integer.valueOf(rangeArray[1]))
              .forEach(
                  value -> {
                    if (isPrimeNumber(value)) {
                      listOfPrimeNumbers.add(value);
                    }
                  });
          if(listOfPrimeNumbers.size() > 0 && !listOfPrimeNumbers.isEmpty()){
			  Integer maxNumber =
					  Stream.of(listOfPrimeNumbers.toArray(new Integer[0]))
							  .max(Comparator.comparing(Integer::valueOf))
							  .get();

			  Integer minNumber =
					  Stream.of(listOfPrimeNumbers.toArray(new Integer[0]))
							  .min(Comparator.comparing(Integer::valueOf))
							  .get();
			  System.out.println(Math.abs(maxNumber - minNumber));
		  } else {
			  System.out.println("-1");
		  }

        });
  }

	static boolean isPrimeNumber(int n)
	{
		if (n <= 1){
			return false;
		} else if (n == 2) {
			return true;
		} else if (n % 2 == 0){
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
