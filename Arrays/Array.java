import java.util.Scanner;

public class Array {
	
	
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
		System.out.println();
	}
	
	public static int largestElement(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i : arr) {
			if(max < i) {
				max=i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr=takeInput();
		printArray(arr);
		System.out.println(arr);
		System.out.println(largestElement(arr));
				
	}

}
