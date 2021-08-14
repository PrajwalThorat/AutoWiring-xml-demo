package org.stackroute.AutoWiring_XML;

public class Employee {
	private EmployeeAddress employeeAddress;

	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeAddress=" + employeeAddress.getStreet()+", "+employeeAddress.getCity() + "]";
	}
	
}
