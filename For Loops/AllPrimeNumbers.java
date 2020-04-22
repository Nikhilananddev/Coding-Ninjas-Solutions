import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i-1;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
			
		}
	}

}
