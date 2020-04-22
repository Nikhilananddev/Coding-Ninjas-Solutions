
public class Sort01 {
	
	public static void sort01(int arr[]) {
		int count0=0;
		for(int i : arr) {
			if(i==0) {
				count0++;
			}
		}
		for(int i=0;i<count0;i++) {
		arr[i]=0;	
		}
		for(int i=count0;i<arr.length;i++) {
			arr[i]=1;
		}
		
	}
	
}
