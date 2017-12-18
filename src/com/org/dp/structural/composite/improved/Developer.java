package com.org.dp.structural.composite.improved;

public class Developer extends Employee {

	public Developer(String name, double salary, EmployeeType employeeType) {
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	@Override
	public Employee getChild(int i) {
		return null;
	}

	@Override
	public void print() {
		System.out.println("------" + this.employeeType.getEmployeeType() + "-------");
		System.out.println("Name =" + this.getName());
		System.out.println("Salary =" + this.getSalary());
		System.out.println("-------------");
	}

}
