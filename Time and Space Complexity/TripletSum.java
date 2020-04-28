import java.util.Arrays;
import java.util.HashMap;

public class TripletSum {
	//O(n^2)
	public static void triplet(int[] arr,int num) {
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			int sum = num-arr[i];
			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(map.containsKey(sum-arr[j])) {
					
					for(int k=0;k<map.get(sum-arr[j]);k++) {
						 System.out.println(arr[i] +" "+ (sum-arr[j])  +" "+arr[j]);
					}
					
					
				}
				
				if(map.containsKey(arr[j])) {
					map.put(arr[j],map.get(arr[j]) + 1);
				}else {
					map.put(arr[j],1);
				}
				
				
			}
			
			
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {1 ,2 ,3 ,4 ,5 ,6 ,7};
		triplet(arr, 12);
		
		
	}

}
