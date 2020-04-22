import java.util.Scanner;

public class TriangularPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}

	}

}
