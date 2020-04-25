
public class CheckNumberInArray {
	
	
	public static boolean checkNumberInArray(int[] arr,int num) {
		return checkNumberInArray(arr,0,arr.length-1,num);
	}

	private static boolean checkNumberInArray(int[] arr, int start, int end,int num) {
		// TODO Auto-generated method stub
		
		if(start > end) {
			return false;
		}
		if(arr[start]==num) {
			return true;
		}
		return checkNumberInArray(arr, start+1, end, num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(checkNumberInArray(arr, 1));

	}

}
