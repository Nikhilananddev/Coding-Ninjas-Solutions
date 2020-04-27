
public class BinarySearch {
	
	public static int binarySearch(int arr[],int num) {
		return binarySearch(arr,0,arr.length-1,num);
	}
	public static int binarySearch(int arr[],int start,int end,int num) {
		
		if(start>end){
			return -1;
		}
		int mid=(start + end)/2;
		if(arr[mid]==num) {
			return mid;
		}
		else if(num < arr[mid]) {
			return binarySearch(arr, start, mid-1, num);
		}
		else {
			return binarySearch(arr, mid+1, end, num);
		}

	}
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,5,6,7,20};
		System.out.println(binarySearch(arr, 20));
		
	}

}
