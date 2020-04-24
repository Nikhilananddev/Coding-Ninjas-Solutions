package Vehicle;
public class Vehicle {
	
	protected String color;
	private int numOfGears;
	
	
	public Vehicle(String color) {
		
		this.color=color;
		this.numOfGears=0;
		
	}
	
	
	public void print() {
		System.out.println(color +" " + numOfGears);
	}

}
