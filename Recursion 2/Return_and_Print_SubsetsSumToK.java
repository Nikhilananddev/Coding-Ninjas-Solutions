
public class Return_and_Print_SubsetsSumToK {

	public static int[][] subsetsToK(int[] arr,int k){
		return subsetsToK(arr,0,arr.length-1,k);
	}
	public static int[][] subsetsToK(int[] arr,int start,int end,int k) {

		if(start>end) {
			if(k==0) {
				return new int[1][0];
			}else {
				return new int[0][0];
			}
		}
		int[][] smallAns1=subsetsToK(arr, start+1, end, k-arr[start]);
		int[][] smallAns2=subsetsToK(arr, start+1, end, k);
		int[][] ans=new int[smallAns1.length + smallAns2.length][];
		for(int i=0;i<smallAns1.length;i++) {
			ans[i]=new int[smallAns1[i].length + 1];
			ans[i][0]=arr[start];
			for(int j=0;j<smallAns1[i].length;j++) {
				ans[i][j+1]=smallAns1[i][j];
			}
			
		}
		for(int i=0;i<smallAns2.length;i++) {
			ans[i + smallAns1.length]=new int[smallAns2[i].length];
			for(int j=0;j<smallAns2[i].length;j++) {
				ans[i + smallAns1.length][j]=smallAns2[i][j];
			}
		}
		return ans;
	}
	public static void printSubsetsToK(int[] arr ,int k) {
		printSubsetsToK(arr, 0, arr.length-1, k, new int[0]);
	}
	
	public static void printSubsetsToK(int[] arr,int start,int end,int k,int[] output) {
		if(start>end) {
			if(k==0) {
				//valid pair
				for(int i : output) {
					System.out.print(i+" ");
				}
				System.out.println();
				return ;
			}else {
				return ;
			}
		}
		int[] temp = new int[output.length+1];
		for(int i=0;i<output.length;i++) {
			temp[i]=output[i];
		}
		temp[temp.length-1]=arr[start];
		printSubsetsToK(arr, start+1, end, k-arr[start],temp);
		printSubsetsToK(arr, start+1, end, k, output);
	}
	public static void main(String[] args) {

		int[] arr= {3,2,5,1,4,6};
//		int[][] ans=subsetsToK(arr, 8);
//		for(int i=0;i<ans.length;i++) {
//			for(int j=0;j<ans[i].length;j++) {
//				System.out.print(ans[i][j] +" ");
//			}
//			System.out.println();
//		}
		printSubsetsToK(arr, 8);
	}

}
