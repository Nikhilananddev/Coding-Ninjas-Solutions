import java.util.Scanner;

public class IsocelesTriangle {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int space=1;space<=(n-i);space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

}
