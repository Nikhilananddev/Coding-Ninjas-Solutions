
public class ShiftZeroes {
	
	public static void shiftZeroes(int[] arr) {
		
		int i=0,j=0;
		while(i<arr.length) {
			
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,0,0,1,9,0,8,0};
		shiftZeroes(arr);
		Array.printArray(arr);

	}

}
