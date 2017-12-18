package com.org.dp.structural.composite.improved;

import java.util.Iterator;

public class Manager extends Employee {

	public Manager(String name, double salary, EmployeeType employeeType) {
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	@Override
	public void add(Employee employee) {
		this.listOfEmployee.add(employee);
	};

	@Override
	public void remove(Employee employee) {
		this.listOfEmployee.remove(employee);
	};

	@Override
	public Employee getChild(int i) {
		return this.listOfEmployee.get(i);
	}

	@Override
	public void print() {
		System.out.println("------" + this.employeeType.getEmployeeType() + "-------");
		System.out.println("Name =" + this.getName());
		System.out.println("Salary =" + this.getSalary());
		System.out.println("-------------");
		System.out.println("Employees Working under " + this.name + " " + this.employeeType.getEmployeeType());
		System.out.println("-------------");

		Iterator<Employee> employeeIterator = this.listOfEmployee.iterator();
	    while(employeeIterator.hasNext()){
	    	Employee employee = employeeIterator.next();
	        employee.print();
	    }
	}
}
