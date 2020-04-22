
public class Factorial {


	public static int factorial(int n) {

		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;

	}
	public static int nCr(int n,int r) {
		
		int num= factorial(n);
		int deno=factorial(n-r) * factorial(r);
		return  num/deno;

	}
	public static void main(String[] args) {
		int num=factorial(6);
		System.out.println(num);
		System.out.println(nCr(10, 6));
	}

}
