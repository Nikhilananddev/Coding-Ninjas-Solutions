
public class Fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	//Dp
	public static int fibonacciDP(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		int[] arr=new int[n+1];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
		
	}
	public static void main(String[] args) {
		int n=7;
		System.out.println(fibonacci(n));
		System.out.println(fibonacciDP(n));
	}

}
