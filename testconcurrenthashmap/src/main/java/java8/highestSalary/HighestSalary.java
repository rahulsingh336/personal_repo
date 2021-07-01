package java8.highestSalary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalary {

  public static void main(String[] args) {
	  HighestSalary highestSalary = new HighestSalary();
	  highestSalary.findHigestLimit();
  }

	private void findHigestLimit() {
		Employee employee1 = new Employee(1, 3);
		Employee employee2 = new Employee(2, 4);
		Employee employee3 = new Employee(3, 5);
		Employee employee4 = new Employee(4, 6);
		Employee employee5 = new Employee(5, 7);
		List list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);

		List<Employee> s = (List) list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
    s.forEach(o -> System.out.println(o.getId() + " - " +o.getSalary()));
	}
}

class Employee {

	private Integer id;
	private Integer salary;

	public Employee(Integer id, Integer salary) {
		this.id = id;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}