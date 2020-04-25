
public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,6,7,8};
		System.out.println(lastIndex(arr, 4));
	}

	public static int lastIndex(int[] arr, int num) {
		
		return lastIndex(arr,0,arr.length-1,num);
	}
	public static int lastIndex(int[] arr,int start,int end,int num) {
		
		if(start > end) {
			return  -1;
		}
		if(arr[end] == num){
			return end;
		}
		return lastIndex(arr, start, end-1, num);
		
	}

}
