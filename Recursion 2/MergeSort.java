
public class MergeSort {
	
	
	public static void mergeSort(int[] arr) {
		 mergeSort(arr,0,arr.length-1);
	}
	public static void mergeSort(int[] arr,int start,int end) {
		if(start>=end) {
			return ;
		}
		int mid= (start + end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,end);
	}
	private static void merge(int[] arr, int start, int end) {
		
		int mid=(start + end)/2;
		int i=start,j=mid+1,k=0;
		int[] temp=new int[end-start+1];
		
		while(i<=mid && j <=end) {
			if(arr[i] <= arr[j]) {
				temp[k++]=arr[i++];
			}
			else {
				temp[k++]=arr[j++];
			}
		}
		
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		int x=0;
		for(int m=start;m<=end;m++) {
			arr[m]=temp[x++];
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,4,3,3,7,8,5};
		mergeSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
