
public class JaggedArrays {

	public static void main(String[] args) {
		int[][] arr=new int[4][0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+2];
		}
		printJaggedArray(arr);
	}

	private static void printJaggedArray(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
