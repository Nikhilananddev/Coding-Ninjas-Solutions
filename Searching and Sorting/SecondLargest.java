
public class SecondLargest {
	
	
	public static int secondLargest(int[] arr) {
		int max=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i] ) {
				secondLargest=max;
				max=arr[i];
			}
			if(arr[i] <max && arr[i] >secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	
	
	public static void main(String[] args) {
		int[] arr=Array.takeInput();
		System.out.println(secondLargest(arr));
	}

}
