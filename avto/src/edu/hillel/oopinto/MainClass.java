package edu.hillel.oopinto;

public class MainClass {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.fuelInTank = 10;
		myCar.color = "green";
		Car myWifeCar = new Car("pink","sedan",1.8, 6, "PINKY",0);
		Car myBrotherCar = new Car();
		
		Human h1 = new Human("Vasia");
		Human h2 = new Human("Kostia");
		
		myCar.fillTank(20);
		myWifeCar.drive(100);
		System.out.println("current fuel level = " + myCar.fuelInTank);
		System.out.println("current color = " + myCar.color);
	}
}
