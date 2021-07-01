package devSkiller;

import java.util.*;
import java.util.function.Supplier;

public class Temp {

  public static void main(String[] args) {
    //
	 /* transform(HashSet::new);
	  transform(new HashSetHashSet());
	  transform(Collections::emptySet);*/
		  /*String prefix = "Maxi";
		  List<String> animals = new ArrayList<>();
		  animals.add("Cat");
		  animals.add("Dog");
		  prefix = "Ultra";
		  animals.stream().forEach(animal -> System.out.println(prefix + animal));*/

	  String s1 = "Test1";
	  String s2 = "Test1";
	  String s3 = new String("Test1");
	  String s4 = String.valueOf("Test1");

	  System.out.println(s1 == s2);
	  System.out.println(s2 == s3);
	  System.out.println(s3 == s4);
	  System.out.println(s1 == s4);
  }

  static void transform(Supplier<Set<String>> strings) {}

	/*static class A {
		public void printMe() { System.out.println("Hi from A class"); }
	}
	static class B extends A {
		private void printMe() { System.out.println("Hi from B class"); }
	}*/
}

//import java.util.*;

class Service {
	boolean firstElementIsEmpty(SortedSet<String> set) {
		return set.first().isEmpty();
	}
}

class Client {
	private Service service = new Service();

	void call() {
		SortedSet<String> strings = new TreeSet<>();
		strings.add("hello");
		strings.add("word");
		service.firstElementIsEmpty(strings);
	}
}

enum State {
	COMPLETE {
		boolean isFinished() { return true; }
	},
	IN_PROGRESS {
		boolean isFinished() { return true; }
	},
	NOT_STARTED {
		boolean isFinished() { return false; }
	};

	 abstract boolean isFinished();
}
