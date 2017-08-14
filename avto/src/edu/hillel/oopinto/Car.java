package edu.hillel.oopinto;

public class Car {
    private String color;
    private String form;
    private double engineV;
    private double fuelConsumption; //расход на 100 км
    private String id;
    private double fuelInTank;  //остаток топлива
    
    
    public Car() {
        fuelInTank = 0;
	    id = "BB001";
    }
    
    public Car(String color, String form, double engineV, double fuelConsumption, String id, double fuelInTank) {
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.fuelInTank = fuelInTank;
    }
    //заправить авто
   public void fillTank(int fuelV) {
        fuelInTank = fuelInTank + fuelV;
    }
    
    //проехать растояние
   public void drive(double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }
	
	public double getFuelInTank() {
		return fuelInTank;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
    	if (color.compareTo("red") != 0)
		this.color = color;
	}
	
	public void setFuelInTank(double fuelInTank) {
		this.fuelInTank = fuelInTank;
	}
}
