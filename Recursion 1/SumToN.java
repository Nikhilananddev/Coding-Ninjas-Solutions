
public class SumToN {

	public static int sumToN(int n) {
		
		if(n==0) {
			return 0;
		}
		return n + sumToN(n-1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(sumToN(n));

	}

}
