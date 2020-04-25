
public class printNumbers {
	
	public static void printNumbersToN(int n) {
		
		if(n==0) {
			return ;
		}
		printNumbersToN(n-1);
		System.out.print(n +" ");
		
		
		
	}
	public static void main(String[] args) {
		int n=10;
		printNumbersToN(n);
	}

}
