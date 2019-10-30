package com.praveen.java.others;

// Immutable class is nothing but content or state will not be changed
public final class EmployeeImmutableClass {
	
	private final String empName;
	private final long empID;
	private final long empSalary;
	private final Address address;
	
	public EmployeeImmutableClass(String empName, long empID, long empSalary,Address address) {
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		this.address=address;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpID() {
		return empID;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeImmutableClass eic= new EmployeeImmutableClass("Praveen",149903L,1000000L,new Address(10001L,"Rangareddy","Hyderabad"));
		Address address=eic.getAddress(); 
		System.out.println(address); // Address [id=10001, desc=Rangareddy, location=Hyderabad]
		address.setLocation("Tirupati");
		address.setDesc("Railway Colony");
		System.out.println(eic.getAddress()); // Address [id=10001, desc=Rangareddy, location=Hyderabad]		
	}
}
