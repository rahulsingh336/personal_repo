package leetcode.sortedArray;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BadVersion extends VersionControl{

  public static void main(String[] args) {
    System.out.println(firstBadVersion(4));
  }

	/*public static int firstBadVersion(int n) {
        //isBadVersion(n);
		OptionalInt optionalPresent = IntStream.range(0, n).filter(value -> isBadVersion(value)).findFirst();
		if (optionalPresent.isPresent()) {
			return optionalPresent.getAsInt();
		}
		return n;
	}*/
	public static int firstBadVersion(int n) {

		int start = 1;
		int end = n;

		return searchBadVersion(start, end);

	}

	private static int searchBadVersion(int start, int end) {

		int middle = end / 2;
		if (isBadVersion(middle)  && middle == 1) return middle;
		if (isBadVersion(middle)) {
			return isBadVersion(middle-1) ? searchBadVersion(start, middle) : (middle) ;
		} else {
			if(isBadVersion(end)) {
				return isBadVersion(end-1) ? searchBadVersion(middle, end-1) : (end);
			}
		}

		return middle;
	}
}

//1,2,3,4,5
//F,T,T,F,F
//F,T,F,F,F


