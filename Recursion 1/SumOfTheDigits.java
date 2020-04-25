
public class SumOfTheDigits {
	
	public static int sumOfTheDigits(int n) {
		
		if(n==0) {
			return 0;
		}
		return n%10 + sumOfTheDigits(n/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		System.out.println(sumOfTheDigits(n));
	}

}
