package edu.hillel.oopinto.subpack;

public class Lawer extends Employee {
	private String mDepartment;
	
	public Lawer(String fullName, long data, long salary, String mDepartment) {
		super(fullName, data, salary);
		this.mDepartment = mDepartment;
	}
}
