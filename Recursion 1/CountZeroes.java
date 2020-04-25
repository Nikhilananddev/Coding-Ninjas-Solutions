
public class CountZeroes {
	
	
public static int countZerosRec(int n) {
		
		if(n==0) {
			return 0;
		}
		int temp= countZerosRec(n/10);
		if(n%10==0) {
			return temp +1;
		}
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10204;
		System.out.println(countZerosRec(n));

	}

}
