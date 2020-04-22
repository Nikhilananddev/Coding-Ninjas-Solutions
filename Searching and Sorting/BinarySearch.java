
public class BinarySearch {
	
	public static int binarySearch(int[] arr,int num) {
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==num) {
				return mid;
			}
			else if(arr[mid] < num) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		System.out.println(binarySearch(arr, 7));

	}

}
