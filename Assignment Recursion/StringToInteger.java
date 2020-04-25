
public class StringToInteger {
	
	
//	public static String convert(int n) {
//		
//		if(n==0) {
//			return "";
//		}
//		String smallAns=convert(n/10);
//		String lastNumber= n %10 +"";  //convert into string
//		return smallAns + lastNumber;
//		
//		
//	}
	
	
	public static int convertStringToInteger(String str) {
		
		
		if(str.length()==0) {
			return 0;
		}
		return (str.charAt(0)-'0')* (int)Math.pow(10, str.length()-1) + convertStringToInteger(str.substring(1));
		
		
	}
	
	public static void main(String[] args) {
		
		String n="12345";
		System.out.println(convertStringToInteger(n));
		
	}

}
