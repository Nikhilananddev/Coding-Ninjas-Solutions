
public class MergeTwoArray {
	
	
	public static int[] mergeSortedArray(int[] arr1,int[] arr2) {
		
		int i=0,j=0,k=0;
		int[] arr=new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j <arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k++]=arr1[i++];
			}else {
				arr[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			arr[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			arr[k++]=arr2[j++];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=Array.takeInput();
		int[] arr2=Array.takeInput();
		int[] arr=mergeSortedArray(arr1, arr2);
		Array.printArray(arr);

	}

}
