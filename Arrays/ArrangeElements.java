
public class ArrangeElements {
	
	public static int[] arrange(int n) {
		
		int[] arr=new int[n];
		int left=0,right=n-1,counter=1;
		while(left<=right) {
			if(counter%2==1) {
				arr[left++]=counter;
			}else {
				arr[right--]=counter;
			}
			counter++;
		}
		
	
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=arrange(11);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
