package com.corejava.company.cognizant;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Frequently asked Java 8 Stream API interview problems.
 */
public final class StreamInterviewQuestions {

    private StreamInterviewQuestions() {
    }

    public static Map<Integer, Long> frequencyByNumber(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
    }

    public static Integer secondHighestDistinct(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "At least two distinct numbers are required"));
    }

    public static Map<String, Double> averageSalaryByDepartment(
            List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));
    }

    public static void main(String[] args) {
        System.out.println(frequencyByNumber(Arrays.asList(1, 2, 2, 3, 3, 3)));
        System.out.println(secondHighestDistinct(Arrays.asList(10, 20, 20, 30)));
        System.out.println(averageSalaryByDepartment(Arrays.asList(
                new Employee("Asha", "IT", 80000),
                new Employee("Ravi", "IT", 90000),
                new Employee("Maya", "HR", 70000))));
    }

    public static final class Employee {
        private final String name;
        private final String department;
        private final double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }
}
