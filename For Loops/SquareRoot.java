import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0,sq=0;
		while(i*i<=n) {
			sq=i;
			i++;
		}

		System.out.println(sq);

	}

}
