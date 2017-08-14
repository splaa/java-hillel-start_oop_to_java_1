package edu.hillel.oopinto.subpack;

public class Employee {
	private String mFullName;
	private long mEmploymenDate;
	private long mSalary;
	
	public Employee(String fullName, long data, long salary) {
		mFullName = fullName;
		mEmploymenDate = data;
		mSalary = salary;
	}
	
	public double getSalaryUah() {
		return mSalary / 100f;
	}
	
}
