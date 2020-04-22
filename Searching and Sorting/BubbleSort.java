
public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		bubbleSort(arr);
		Array.printArray(arr);

	}

	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				return;
			}
		}
		
	}

}
