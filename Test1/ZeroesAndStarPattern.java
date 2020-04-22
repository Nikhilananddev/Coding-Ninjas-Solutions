import java.util.Scanner;

public class ZeroesAndStarPattern {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int l=2*n+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=l;j++) {
				if(j==(n+1) || j==i || i== l-j+1) {
					System.out.print("*");
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		
	}

}
