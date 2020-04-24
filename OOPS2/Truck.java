package Temp;
import Vehicle.Vehicle;

public class Truck extends Vehicle {
	
	
	public Truck() {
		// TODO Auto-generated constructor stub
		super("Red");
	}
	
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(color);  // protected so..subclasses used outside the package.
	}

}
