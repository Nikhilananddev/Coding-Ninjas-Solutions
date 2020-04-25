
public class QuickSort {
	
	
	public static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		
		if(start>=end) {
			return ;
		}
		int pivotPos=partition(arr,start,end);
		quickSort(arr, start, pivotPos-1);
		quickSort(arr, pivotPos+1, end);
		
	}
	public static int partition(int[] arr,int start,int end) {
		
		int pivot=arr[start];
		int count=0;
		for(int i=start+1;i<=end;i++) {
			if(arr[i] <= pivot) {
				count++;
			}
		}
		
		int pivotPos=start+count;
		int temp=arr[pivotPos];
		arr[pivotPos]=arr[start];
		arr[start]=temp;
		
		int i=start,j=end;
		while(i < pivotPos && j> pivotPos) {
			if(arr[i] <= pivot) {
				i++;
			}
			else if(arr[j] > pivot) {
				j--;
			}
			else {
				int temp2=arr[i];
				arr[i]=arr[j];
				arr[j]=temp2;
				i++;
				j--;
				
			}
		}
		return pivotPos;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,4,3,3,7,8,5};
		quickSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
