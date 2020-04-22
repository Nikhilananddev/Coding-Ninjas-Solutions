import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

//	public static int count(int[] arr,int item,int start,int end) {
//		int c=0;
//		for(int i=start;i<=end;i++) {
//			if(arr[i]==item) {
//				c++;
//			}
//		}
//		return c;
//	}
//// O(nlogn) if there is duplicates than O(n*n) but rare case
//	public static void pairSum(int[] arr,int sum) {
//
//		Arrays.sort(arr);
//		int i=0;
//		int j=arr.length-1;
//		while(i<j) {
//			if(arr[i]+arr[j]==sum) {
//				int m=count(arr,arr[i],i,j);
//				int n=count(arr,arr[j],i,j);
//				for(int x=0;x<m*n;x++)
//					System.out.println(arr[i]+" " + arr[j]);
//				i+=m;
//				j-=n;
//			}
//			else if(arr[i] + arr[j] < sum) {
//				i++;
//			}else {
//				j--;
//			}
//		}
//
//
//	}
	//O(n*n)
	public static void pairSum2(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sum) {
					System.out.println(Math.min(arr[i], arr[j])  +" " + Math.max(arr[i], arr[j]) );
				}
			}
		}
	}
	// using HashMap
	//same time insertion and print algo
	public static void pairSumUsingHashMap(int[] arr,int sum) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i : arr) {
			
			if( map.containsKey(sum-i)) {
				for(int count=0;count<map.get(sum-i);count++)
					System.out.println(Math.min(i, sum-i) + " " + Math.max(i, sum-i));
			}
			if(map.containsKey(i)) {
				map.put(i,map.get(i) + 1);
			}else {
				map.put(i,1);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		pairSumUsingHashMap(arr, 7);
	}

}
