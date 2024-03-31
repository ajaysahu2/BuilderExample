package components;

import cars.Car;

public class TripComputer {
	private Car car;
	public void showFuelLevel() 
	{
		System.out.println("Fuel level:"+car.getFuel());
	}
	 public void showStatus() {
	        if (this.car.getEngine().isstarted()) {
	            System.out.println("Car is started");
	        } else {
	            System.out.println("Car isn't started");
	        }
	    }
	public void setCar(Car car) {
		this.car = car;
		
	}
	
	
}
