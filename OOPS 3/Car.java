//
//public class Car extends Vehicle {       // can't extend / inherit vehicle class
//	
//	void print() {          // cant override
//		System.out.println("car print fn");
//	}
//
//}
//public  class Car extends Vehicle{

public class Car extends Vehicle implements VehicleInterface{   // a class can implement multiple interface but not inherit from multiple classes

	public boolean isMotorised() {
		return true;
	}
	public void print() {
		System.out.println("Car");
	}

}