
public class LeadersOfArray {
	
	public static void leaders(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++) {
			boolean allSmaller=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					allSmaller=false;
					break;
				}
			}
			if(allSmaller) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,17,5,4,6};
		leaders(arr);
	}

}
