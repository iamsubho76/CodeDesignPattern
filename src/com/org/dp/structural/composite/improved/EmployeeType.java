package com.org.dp.structural.composite.improved;

public enum EmployeeType {
	MANAGER("MANAGER"), 
	TEAM_LEAD("TEAM_LEAD"), 
	PROJECT_LEAD("PROJECT_LEAD"), 
	MODULE_LEAD("MODULE_LEAD"), 
	DEVELOPER("DEVELOPER");

	private String employeeType;

	EmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmployeeType() {
		return employeeType;
	}
}
