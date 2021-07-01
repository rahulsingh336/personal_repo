package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class StreamExample {

  public static void main(String[] args) {
	  /*List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
    System.out.println(transform(collection).size());*/
	  Person sara = new Person("Sara", 4);
	  Person viktor = new Person("Viktor", 40);
	  Person eva = new Person("Eva", 42);
	  List<Person> collection = asList(sara, eva, viktor);
    // System.out.println(getOldestPerson(collection).getAge());
	  List<Integer> numbers = asList(1, 2, 3, 4, 5);
    System.out.println(calculate(numbers));
  }

	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
		return Stream.of(names).filter(f -> f.length() > 5).mapToInt(value -> value.length()).sum();
	}

	public static List<String> transform(List<List<String>> collection) {
		List<String> newCollection = new ArrayList<>();
		for (List<String> subCollection : collection) {
			for (String value : subCollection) {
				newCollection.add(value);
			}
		}
		return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
		//.return newCollection;
	}

	public static Person getOldestPerson(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return people.stream().max(Comparator.comparing(Person::getAge)).get();
		//return oldestPerson;
	}

	public static int calculate(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return numbers.stream().reduce(0, (integer, integer2) -> integer + integer2);
		//return total;
	}

	public static Set<String> getKidNames(List<Person> people) {
		Set<String> kids = new HashSet<>();
		for (Person person : people) {
			if (person.getAge() < 18) {
				kids.add(person.getName());
			}
		}
		people.stream().filter(person ->
			person.getAge() < 18
		).collect(toSet());
		return kids;
	}

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		Map<Boolean, List<Person>> map = new HashMap<>();
		map.put(true, new ArrayList<>());
		map.put(false, new ArrayList<>());
		for (Person person : people) {
			map.get(person.getAge() >= 18).add(person);
		}
		people.stream() // Convert collection to Stream
				.collect(
						partitioningBy(p -> p.getAge() >= 18));
		return map;
	}

	public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		Map<String, List<Person>> map = new HashMap<>();
		for (Person person : people) {
			if (!map.containsKey(person.getNationality())) {
				map.put(person.getNationality(), new ArrayList<>());
			}
			map.get(person.getNationality()).add(person);
		}
		return people.stream().collect(Collectors.groupingBy(o -> o.getNationality()));
		//return map;
	}
}
