package edu.hillel.oopinto;

public class Car {
    private String color;
    private String form;
    private double engineV;
    private double fuelConsumption; //расход на 100 км
    private String id;
    private double fuelInTank;  //остаток топлива
    
    
    Car() {
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
    void fillTank(int fuelV) {
        fuelInTank = fuelInTank + fuelV;
    }
    
    //проехать растояние
    void drive(double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }
}
