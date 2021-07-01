package codility;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S1 {

  public static void main(String[] args) {
	  S1 s1 = new S1();
	  //String aba = "aba";
	  //String aba = "zz";
	  String aba = "codiltiy";
	  System.out.println(s1.solution(aba));
  }

	public String solution(String s) {
		// write your code in Java SE 8
		Stream<Character> tmp = s.chars().mapToObj(value -> (char)value);
		return tmp.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 2).findFirst().get().getKey().toString();
	}
}
