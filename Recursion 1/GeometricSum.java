
public class GeometricSum {
	
	
	public static double findGeometricSum(int n) {
		
		
		if(n==0) {
			return 1;
		}
		return 1/Math.pow(2, n) + findGeometricSum(n-1);
		
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(findGeometricSum(n));
	}

}
