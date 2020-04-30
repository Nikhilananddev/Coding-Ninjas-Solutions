
public class Use {

	
	public static<T extends CarInterface> void printArray(T arr[]) {   // classes that implements Interface only works 
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}
	}
	
	
	public static void main(String[] args) {
		
	//	Vehicle v=new Vehicle();    //abstract classes doesnt have objects
//		Car c=new Car();
//		System.out.println(c.isMotorised());
//		VehicleInterface v=new Car();
//		System.out.println(v.PI);
		
//		Pair<String,String> p=new Pair<>("xy","yz");
//		
//		System.out.println(p.getFirst()+" "+p.getSecond());
//		Pair<Pair<String,String>, Integer> triplet=new Pair<>(p,5);
//		System.out.println(triplet.getFirst().getFirst());
//		
//		Integer arr[]= {1,2,3,4,5,6,7};
//		printArray(arr);
//		Student[] s =new Student[1];
//		s[0]= new Student();
//		printArray(s);
		
		
		Integer i =new Integer(6);
		System.out.println(i);  // i is a variable ( wrapper class object is a object that contains value not address) 
		
		String s="abc";
		s="def";
		System.out.println(s);   // printing s gives value ....beacuse String is a speacial class that prints values not adrress.
	
		
	}
	
	
}
