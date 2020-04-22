
public class SumTwoArrays {
	
	
	
	public static int[] sumOfArrays(int[] arr1,int[] arr2) {
		
		int[] arr=new int[Math.max(arr1.length,arr2.length)+1]; 
		int carry=0,i=arr1.length-1,j=arr2.length-1,k=arr.length-1;
		while(i>=0 && j>=0) {
			
			int sum=arr1[i--]+arr2[j--] + carry;
			arr[k--]=sum%10;
			carry=sum/10;
			
		}
		while(i>=0) {
			int sum=arr1[i--]+carry;
			arr[k--]=sum%10;
			carry=sum/10;
		}
		while(j>=0) {
			int sum=arr2[j--]+carry;
			arr[k--]=sum%10;
			carry=sum/10;
		}
		arr[0]=carry;
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr1= {3,9,9};
		int[] arr2={4,1,1};
		int[] arr=sumOfArrays(arr1, arr2);
		Array.printArray(arr);
		
	}

}
