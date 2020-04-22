import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int n1=n/2+1;
		int n2=n-n1;
		for(int i=1;i<=n1;i++) {
			
			for(int space=1;space<=(n1-i);space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k=n2-1;
		for(int i=1;i<=n2;i++) {
			for(int space=1;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*k+1);j++) {
				System.out.print("*");
			}
			k--;
			System.out.println();
		}


	}

}
