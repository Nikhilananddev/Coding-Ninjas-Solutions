
public class CheckSorted {
	
	
	public static boolean checkSorted(int[] arr) {
		return checkSorted(arr,0,arr.length-1);
	}
	public static boolean checkSorted(int[] arr,int start,int end) {
		
		if(start >= end) {
			return true;
		}
		if(arr[start] > arr[start +1]) {
			return false;
		}
		return checkSorted(arr, start+1, end);
		
	}
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8,3};
		System.out.println(checkSorted(arr));
	}

}
