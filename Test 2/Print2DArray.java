
public class Print2DArray {
	
	
	public static void print2DArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int k=0;k<(arr.length-i);k++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		print2DArray(arr);

	}

}
