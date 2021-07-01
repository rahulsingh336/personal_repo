package ikm;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestIKM {

  public static void main(String[] args) {
	  Integer integer = new Integer(1);
	  Integer integer1 = integer;
	  integer = integer +1;
    System.out.println(integer);
    System.out.println(integer1);

    Integer integer2 = 3;
    Integer integer3 = null;
    //System.out.println(Integer.compareUnsigned(integer2, integer3) == 0 || Integer.compareUnsigned(integer3, 0) == 0);

	  Set<String> set = new LinkedHashSet<>();
	  set.add("3");
	  set.add("1");
	  set.add("3");
	  set.add("2");
	  set.add("3");
	  set.add("1");
    set.forEach(s -> System.out.println(s+"-"));

	  Supplier<String> i = () -> "Car";
	  Consumer<String> c = x -> System.out.println(x.toLowerCase());
	  Consumer<String> d = x -> System.out.println(x.toUpperCase());
	  c.andThen(d).accept(i.get());
    System.out.println();
    //System.getProperties().se
	  List<String> list = new ArrayList<>();
	  list.add("1");
	  list.add("2");
	  list.add(0, "3");
	  list.add(1, "4");
    list.forEach(c1 -> System.out.println(c1));

    System.out.println(Stream.of("green", "yellow", "blue").max((s1, s2) ->
			s1.compareTo(s2)).filter(s -> s.endsWith("n")).orElse("yellow"));
	  //ResourceBundle.getBundle()
	  Formatter j = null;
	  //Internation
	  int a =9, b=2;
	  float f;
	  f = a/b;
    System.out.println("f = "+ f);
    f = f/2;
    System.out.println("f = "+ f);
    f = a+b /f;
    System.out.println("f = "+ f);
  }
}
