package com.org.dp.structural.composite.improved;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	public String name;
	public double salary;
	public EmployeeType employeeType;

	List<Employee> listOfEmployee = new ArrayList<>();

	public void add(Employee employee) {
	};

	public void remove(Employee employee) {
	};

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public abstract Employee getChild(int i);

	public abstract void print();
}
