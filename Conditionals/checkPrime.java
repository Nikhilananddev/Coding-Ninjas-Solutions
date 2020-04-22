import java.util.Scanner;

public class checkPrime {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=2;
		int n=scan.nextInt();
		while(i<n) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}
			i++;
		}
		System.out.println("Prime");
		
	}
}
