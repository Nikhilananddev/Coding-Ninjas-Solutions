import java.util.Scanner;

public class Array2D {
	
	public static int[][] takeInput() {
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		return arr;
	}
	public static void printArray2D(int[][] arr) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr=takeInput();
		printArray2D(arr);
	}

}
