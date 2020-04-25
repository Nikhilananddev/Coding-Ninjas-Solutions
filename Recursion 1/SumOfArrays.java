
public class SumOfArrays {

	
	public static int sumOfArrays(int[] arr) {
		return sumOfArrays(arr,0,arr.length-1);
	}
	private static int sumOfArrays(int[] arr,int start,int end) {
		
		if(start>end) {
			return 0;
		}
		return arr[start] + sumOfArrays(arr, start+1, end);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		System.out.println(sumOfArrays(arr));

	}

}
