import java.util.Scanner;

public class RowWiseSum {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum+=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
