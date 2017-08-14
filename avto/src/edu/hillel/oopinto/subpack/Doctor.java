package edu.hillel.oopinto.subpack;

public class Doctor extends Employee{
	
	private int mCategory;
	
	public Doctor(String fullName, long data,long salary, int category) {
		super(fullName,data,salary);
		mCategory = category;
		
	}
}
