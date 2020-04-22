
public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeTillN(int n) {
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		int n=100;
		printPrimeTillN(n);
		
	}
	

}
