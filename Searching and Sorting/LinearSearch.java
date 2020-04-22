
public class LinearSearch {
	
	
	public static int linearSearch(int[] arr,int n) {
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Array.takeInput();
		System.out.println(linearSearch(arr, 15));
	}

}
