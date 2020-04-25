
public class MultiplyTwoIntegers {
	
	public static int multiplyTwoIntegers(int a,int b) {
		
		if(b==0) {
			return 0;
		}
		return a + multiplyTwoIntegers(a, b-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyTwoIntegers(12, 5));

	}

}
