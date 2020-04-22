import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(n-j+1 == i) {
					System.out.print("*");
				}else {
					System.out.print(n-j+1);
				}
			}
			System.out.println();
		}

	}

}
