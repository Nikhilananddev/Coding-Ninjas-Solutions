
public class AllIndexs {
	
	
	public static int[] allIndexes(int[] arr,int num) {
		return allIndexes(arr, 0, arr.length-1, num);
	}
	public static int[] allIndexes(int[] arr,int start,int end,int num) {
		if(start > end) {
			return new int[0];
		}
		
		int[] smallAns=allIndexes(arr, start+1, end, num);
		if(arr[start]==num) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=start;
			for(int i=0;i<smallAns.length;i++)
				ans[i+1]=smallAns[i];
			return ans;
		}
		return  smallAns;
	
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,5,2,5,6,3,4,2,2};
		int[] ans=allIndexes(arr, 2);
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
	
	
	

}
