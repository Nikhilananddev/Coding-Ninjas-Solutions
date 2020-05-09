import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(20);
		arr.add(2,15);
		System.out.println(arr.get(3));
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) +" ");
		}
		System.out.println();
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.println(arr.remove(i));
		}
		System.out.println(arr.isEmpty());
		
		

	}

}
