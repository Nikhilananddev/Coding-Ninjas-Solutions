import java.util.Scanner;

public class DecimalToBinary {
	 
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long res=0,p=0;
		while(n>0) {
			int a=n%2;
			res=res+a*(long)Math.pow(10,p++);
			n=n/2;
		}
		System.out.println(res);
		
	}

}
