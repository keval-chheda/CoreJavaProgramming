package com.infra.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionEx13 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum: " + sum); // Output: Sum: 15

		// same thing with different way
		int sum1 = numbers.stream().mapToInt(Integer::intValue) // Convert the stream to an IntStream
				.sum(); // Sum the elements of the IntStream
		System.out.println("Sum: " + sum1); // Output: Sum: 15

//		2. Map
//		The map operation is an intermediate operation that returns a stream consisting of the results of applying a given function to the elements of the stream.
		List<String> names = Arrays.asList("John", "Jane", "Doe");

		List<String> upperCaseNames = names.stream().map(s -> s.toLowerCase())
//	                                           .map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println("uppercasse" + upperCaseNames);

		// with substring method
//		Function<String, String> function1 = (s) -> s.substring(0,1);
//		Function<List<Student>, List<Student>> studentwithK = li ->{
//			List<Student> result = new ArrayList<>();
//			for(Student s : li) {
//				if(function1.apply(s.getName()).equalsIgnoreCase("k")) {
//					result.add(s);
//				}
//			}
//			return result;
//			
//		};

		// with startsWith meth
//		Function<String, Boolean> function1 = (s) -> s.startsWith("k");
//		Function<List<Student>, List<Student>> studentwithK = li -> {
//			List<Student> result = new ArrayList<>();
//			for (Student s : li) {
//				if (function1.apply(s.getName())) {
//					result.add(s);
//				}
//			}
//			return result;
//
//		};
//
//		Student s1 = new Student(1, "keval");
//		Student s2 = new Student(2, "Vinod");
//		List<Student> students = new ArrayList<>(Arrays.asList(s1, s2));
//		List<Student> filteredStudent = studentwithK.apply(students);
//		System.out.println(filteredStudent);

//		  Function<String, Boolean> function1 = (s) -> s.startsWith("k"); // Check if name starts with "k" (case-sensitive)

//----------------------------------------------------------------------------------------------------------------------//

		Predicate<Student> predicate = (student) -> student.getName().startsWith("k");

		List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "keval"), new Student(2, "Vinod")));

		List<Student> filteredStudents = students.stream().filter(predicate) // Use function1 directly
				.collect(Collectors.toList()); // Collect filtered elements into a new list

		System.out.println(filteredStudents);

//--------------------------------------------------------------------------------------------------------------------//

		Function<String, Boolean> function1 = (s) -> s.startsWith("k"); // Check if name starts with "k"
																		// (case-sensitive)

		List<Student> functionfilteredStudents = students.stream().filter(s -> function1.apply(s.getName())) // Use the
																												// function
																												// with
																												// a
																												// lambda
				.collect(Collectors.toList()); // Collect filtered elements into a new list

		System.out.println(functionfilteredStudents);

//----------------------------------------------------------------------------------------------------------------//

		Function<String, Boolean> function2 = (s) -> s.startsWith("k"); // Check if name starts with "k"
																		// (case-sensitive)
		Predicate<Student> predicate1 = s -> function2.apply(s.getName());

		List<Student> functionfilteredStudents2 = students.stream()

				.filter(predicate1) // Use function1 directly
				.collect(Collectors.toList()); // Collect filtered elements into a new list

		System.out.println(functionfilteredStudents2);
	}

//-------------------------------------------------------------------------------------------------------------------------//

	public static class Student {
		int id;
		String name;

		Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

	}

}
