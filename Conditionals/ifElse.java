import java.util.Scanner;
public class ifElse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		if(n%2==0) {
//			System.out.println("Even");
//			return;
//		}
//		System.out.println("Odd");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) {
		System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
