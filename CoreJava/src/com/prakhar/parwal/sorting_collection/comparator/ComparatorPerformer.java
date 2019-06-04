package com.prakhar.parwal.sorting_collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPerformer {
	
	public static void main(String... q)
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Prakhar", 27));
		employees.add(new Employee(2, "Sudeep", 26));
		employees.add(new Employee(3, "Nikhil", 26));
		
		Collections.sort(employees, new EmployeeNameComparator());
		
		employees.stream().forEach(System.out::println);
		
	}
}
