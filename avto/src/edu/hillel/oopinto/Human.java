package edu.hillel.oopinto;

public class Human {
	String Name;
	int salary;
	int experience;
	
	public Human(String name) {
		Name = name;
	}
	
	int calcSalary() {
		return salary * (1 + experience / 5);
	}
}
