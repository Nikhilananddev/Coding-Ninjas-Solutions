
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		selectionSort(arr);
		Array.printArray(arr);

	}

	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < min) {
					min=arr[j];
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				arr[minIndex]=arr[i];
				arr[i]=min;
			}
			
		}
		
	}

}
