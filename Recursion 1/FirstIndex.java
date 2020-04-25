
public class FirstIndex {


	public static int firstIndex(int[] arr ,int start ,int end,int num) {

		if(start > end){
			return -1;
		}
		if(arr[start]==num) {
			return start;
		}
		return firstIndex(arr, start+1, end, num);
	}
	public static int firstIndex(int[] arr,int num) {
		return firstIndex(arr, 0, arr.length-1, num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,4,6,7,8,4};
		System.out.println(firstIndex(arr, 4));
	}

}
