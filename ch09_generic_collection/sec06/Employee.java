package ch09_generic_collection.sec06;

import javax.management.loading.PrivateClassLoader;

public class Employee {

	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
		



}
