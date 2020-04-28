import java.util.HashMap;

public class PairSum {
	//O(n)
	public static void pairSum(int[] arr,int sum) {
		HashMap<Integer, Integer> map=new  HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(sum-arr[i])) {
				for(int j=0;j< map.get(sum-arr[i]);j++) {
					
					if(arr[i] < sum-arr[i]) {
						System.out.println(arr[i] +" "+ (sum-arr[i]));
					}else {
						System.out.println(sum-arr[i] +" "+ arr[i]);
					}
					
					
				}
			}
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) +1);
			}else {
				map.put(arr[i],1);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {1 ,3 ,6 ,2 ,5 ,4 ,3 ,2 ,4};
 		pairSum(arr, 7);
		
		
	}

}
