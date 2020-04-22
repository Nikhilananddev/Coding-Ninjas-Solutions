
public class CheckArrayRotation {
	
	public static int checkRotation(int[] arr) {
		int min=Integer.MAX_VALUE;
		int minIndex=Integer.MAX_VALUE;
		for(int  i=0;i<arr.length;i++) {
			if(arr[i] < min) {
			min=arr[i];
			minIndex=i;
			}
		}
		return minIndex;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr=Array.takeInput();
		System.out.println(checkRotation(arr));
	}

}
