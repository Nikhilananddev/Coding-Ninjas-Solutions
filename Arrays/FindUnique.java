
public class FindUnique {
	
	//best
	public static int findUnique(int[] arr) {
		int unique=0;
		for(int i=0;i<arr.length;i++) {
			unique^=arr[i];
		}
		return unique;
		
	}
	public static int findUnique2(int[] arr) {
		
		for(int i=0 ; i< arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				return arr[i];
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=Array.takeInput();
		Array.printArray(arr);
		System.out.println(findUnique2(arr));
		
	}

}
