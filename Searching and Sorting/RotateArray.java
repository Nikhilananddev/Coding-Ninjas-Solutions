
public class RotateArray {
	
	public static void LeftRotateArray(int[] arr,int d) {
		int[] temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		int k=0;
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=temp[k++];
		}
		
	}
	public static void rightRotateArray(int[] arr,int d) {
		int[] temp=new int[arr.length-d];
		for(int i=0;i<temp.length;i++) {
			temp[i]=arr[i];
		}
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i-arr.length+d]=arr[i];
		}
		int k=0;
		for(int i=d;i<arr.length;i++) {
			arr[i]=temp[k++];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		LeftRotateArray(arr, 2);
//		rightRotateArray(arr, 2);
		Array.printArray(arr);
		

	}

}
