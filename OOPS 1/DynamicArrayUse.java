package DynamicArray;

public class DynamicArrayUse {

	public static void main(String[] args) throws ArrayEmptyException {
		
		DynamicArray arr=new DynamicArray();
		for(int i=0;i<100;i++) {
			arr.addLast(i+1);
		}
		arr.set(10, 79);
		System.out.println(arr.get(99) + " " + arr.size());
		while(!arr.isEmpty()) {
			System.out.println(arr.removeLast() +" "+ arr.size());
		}
		System.out.println(arr.size());

	}

}
