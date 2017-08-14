package edu.hillel.oopinto;

import edu.hillel.oopinto.subpack.Doctor;
import edu.hillel.oopinto.subpack.Employee;
import edu.hillel.oopinto.subpack.Lawer;

public class MainClass {
	public static void main(String[] args) {
		
		Employee[] emps = new Employee[3];
		emps[0] = new Doctor("Vasya", 1234, 300000, 1);
		emps[1] = new Lawer("Petia", 1234, 9000000, "Criminal");
		emps[2] = new Lawer("Vasya", 1234, 5000000, "Criminal");
		
		double totalSalary = 0;
		for (int i = 0; i < emps.length; i++) {
			totalSalary += emps[i].getSalaryUah();
			System.out.println("Сумма зарплат массива сотрудников: " + totalSalary);
		}
		
		
		Doctor d1 = new Doctor("Vasya", 1234, 300000, 1);
		Lawer l1 = new Lawer("Petia", 1234, 9000000, "Criminal");
		
		d1.getSalaryUah();
		l1.getSalaryUah();
		double totalSalaryEmpl = d1.getSalaryUah() + l1.getSalaryUah();
		System.out.println("Сумма зарплат: " + totalSalaryEmpl);
		
		
		Car myCar = new Car();
		myCar.setFuelInTank(10);
		myCar.setColor("green");
		Car myWifeCar = new Car("pink","sedan",1.8, 6, "PINKY",0);
		Car myBrotherCar = new Car();
		
		Human h1 = new Human("Vasia");
		Human h2 = new Human("Kostia");
		
		myCar.fillTank(20);
		myWifeCar.drive(100);
		System.out.println("current fuel level = " + myCar.getFuelInTank());
		System.out.println("current color = " + myCar.getColor());
	}
}
