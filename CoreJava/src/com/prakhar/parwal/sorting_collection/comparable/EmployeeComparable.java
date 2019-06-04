package com.prakhar.parwal.sorting_collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable {

	public static void main(String... q)
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Prakhar", 27));
		employees.add(new Employee(2, "Sudeep", 26));
		employees.add(new Employee(3, "Nikhil", 26));
		
		Collections.sort(employees);
		
		employees.stream().forEach(System.out::println);
		
	}
	
}

class Employee implements Comparable<Employee>
{
	
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Employee() {
		super();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Employee employee)
	{
		return this.name.compareTo(employee.getName());
	}
	
	@Override
	public String toString()
	{
		return "Id: "+this.id+" name: "+this.name+" age: "+this.age;
	}
	
}
