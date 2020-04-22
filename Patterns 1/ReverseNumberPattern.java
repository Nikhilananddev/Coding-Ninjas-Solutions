import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			int val=i;
			for(int j=1;j<=i;j++) {
				System.out.print(val--);
			}
			System.out.println();
		}


	}

}
