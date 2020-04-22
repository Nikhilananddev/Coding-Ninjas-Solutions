import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		if(a==1) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println(sum);
		}
		else if(a==2) {
			int p=1;
			for(int i=1;i<=n;i++) {
				p*=i;
			}
			System.out.println(p);
		}
		else {
			System.out.println(-1);
		}

	}

}
