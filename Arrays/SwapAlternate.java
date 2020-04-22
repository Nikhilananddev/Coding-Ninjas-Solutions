import java.util.Scanner;


public class SwapAlternate {
	
	
	public static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void swapAlternate(int []arr) {
		
		for(int i=0 ; i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takeInput();
		swapAlternate(arr);
		printArray(arr);

	}

}
