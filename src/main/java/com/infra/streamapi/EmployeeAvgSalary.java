package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAvgSalary {

	private String name;
	private String department;
	private int age;
	private double salary;

	public EmployeeAvgSalary(String name, String department, int age, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeAvgSalary> listofEmployee = Arrays.asList((new EmployeeAvgSalary("keval", "developer", 24, 20000)),
				(new EmployeeAvgSalary("keval", "developer", 24, 20000)),		
				(new EmployeeAvgSalary("vinod", "developer", 24, 25000)),
				(new EmployeeAvgSalary("demo123", "HR", 24, 20000)),
				(new EmployeeAvgSalary("laksmi", "HR", 24, 26000)),
				(new EmployeeAvgSalary("damini", "developer", 24, 200000))


		);
		
		Map<String, Double> mapDepartment = listofEmployee.stream()
				.collect(Collectors.groupingBy(EmployeeAvgSalary::getDepartment, Collectors.averagingDouble(EmployeeAvgSalary::getSalary)));
		
		mapDepartment.forEach((Department, avgSalary) -> System.out.println(Department +"==>"+ avgSalary));

	}

}
