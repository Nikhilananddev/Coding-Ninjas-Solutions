
public class Power {
	
	public static long power(int a,int b) {
		
		if(b==0) {
			return 1;
		}
		return a * power(a,b-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=5;
		System.out.println(power(a, b));

	}

}
