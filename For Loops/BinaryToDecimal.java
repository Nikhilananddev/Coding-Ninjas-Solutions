import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=0;
		int res=0;
		while(n>0) {
		  int a=n%10;
		  res=res+(a*(int)Math.pow(2, p++));
		  n=n/10;
		}
		System.out.println(res);

	}

}
