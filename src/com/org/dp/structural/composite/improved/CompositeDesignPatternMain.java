package com.org.dp.structural.composite.improved;

public class CompositeDesignPatternMain {


		 
		 public static void main(String[] args) {
		  Employee emp1=new Developer("John", 10000, EmployeeType.DEVELOPER);
		  Employee emp2=new Developer("David", 15000, EmployeeType.DEVELOPER);
		  Employee manager1=new Manager("Daniel",25000, EmployeeType.MANAGER);
		  manager1.add(emp1);
		  manager1.add(emp2);
		  Employee emp3=new Developer("Michael", 20000, EmployeeType.DEVELOPER);
		  Manager generalManager=new Manager("Mark", 50000, EmployeeType.MANAGER);
		  generalManager.add(emp3);
		  generalManager.add(manager1);
		  generalManager.print();
	}
}
