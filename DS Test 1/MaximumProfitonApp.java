import java.util.Arrays;

public class MaximumProfitonApp {
	
	public static int maximumProfitOnApp(int[] arr) {
		
		Arrays.sort(arr);
		int[] profit=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			profit[i]=(arr.length-i)*arr[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i : profit) {
			if(max < i) {
				max=i;
			}
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		int[] arr= {30,20,14,53};
		System.out.println(maximumProfitOnApp(arr));

	}

}
