
public class ArraySum {

	public static int sum(int[] input) {
		int sum=0;
		for(int i : input) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,8};
		System.out.println(sum(arr));
		
	}

}
