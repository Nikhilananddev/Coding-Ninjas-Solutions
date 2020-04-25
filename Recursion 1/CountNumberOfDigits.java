
public class CountNumberOfDigits {
	
	public static int countNumberOfDigits(int n) {
		
		
		if(n==0) {
			return 0;
		}
		return 1 + countNumberOfDigits(n/10);
		
	}
	
	
	public static void main(String[] args) {
		int n=153;
		System.out.println(countNumberOfDigits(n));
	}

}
