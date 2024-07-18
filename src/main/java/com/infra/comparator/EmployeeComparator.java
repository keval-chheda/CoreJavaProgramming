package com.infra.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	private String designation;

	public Employee(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emplyee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}

}

public class EmployeeComparator {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("keval", 25, "consultant"));
		emp.add(new Employee("urvashi", 26, "consultant"));
		emp.add(new Employee("damini", 22, "consultant"));
		emp.add(new Employee("priya", 24, "consultant"));
		emp.add(new Employee("keval", 20, "consultant"));

		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		Comparator<Employee> byAge = Comparator.comparing(Employee::getAge);

		emp.sort(byName.thenComparing(byAge));
		emp.forEach(System.out::print);

		emp.stream().sorted(byName.thenComparing(byAge)).collect(Collectors.toList());

	}

}
