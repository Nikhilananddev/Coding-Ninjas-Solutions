
public class Return_and_Print_SubsetsOfArray {
	
	public static int[][] subsetsOfArray(int[] arr){
	
		return subsetsOfArray(arr,0,arr.length-1);
	}
	public static int[][] subsetsOfArray(int[] arr,int start,int end){
		
		if(start>end) {
			return new int[1][0];
		}
		int[][] smallAns=subsetsOfArray(arr, start+1, end);
		int[][] ans=new int[smallAns.length * 2][];
		
		for(int i=0;i<smallAns.length;i++) {
			ans[i]=new int[smallAns[i].length];
			for(int j=0;j<smallAns[i].length;j++) {
				ans[i][j]=smallAns[i][j];
			}
		}
		for(int i=smallAns.length ; i<ans.length;i++) {
			ans[i]=new int[smallAns[i-smallAns.length].length + 1];
			ans[i][0]=arr[start];
			for(int j=1;j<ans[i].length;j++) {
				ans[i][j]=smallAns[i-smallAns.length][j-1];
			}
		}
		return ans;
	}
	
	
	public static void printSubsets(int[] arr) {
		printSubsets(arr,0,arr.length-1,new int[0]);
	}
	
	public static void printSubsets(int[] arr,int start,int end,int[] output) {
		
		if(start>end) {
			for(int i  : output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return ;
		}
		int[] temp=new int[output.length + 1];
	
		for(int i=0;i<output.length;i++) {
			temp[i]=output[i];
		}
		temp[temp.length-1]=arr[start];
				
		printSubsets(arr, start+1, end, temp);
		printSubsets(arr, start+1, end, output);

	}
	
	 
	public static void main(String[] args) {
		int[] arr= {1,2,3};
//		int[][] ans=subsetsOfArray(arr);
//		for(int i=0;i<ans.length;i++) {
//			for(int j : ans[i]) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		printSubsets(arr);
	}
	

}
