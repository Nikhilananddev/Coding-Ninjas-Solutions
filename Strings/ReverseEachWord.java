
public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		
		String x="";
		int spaceIndex=0;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() ||  str.charAt(i)==' ' ) {
				x=x+reverse(str.substring(spaceIndex,i))+" ";
				spaceIndex=i+1;
			}
		}
		return x;
		
	}
	private static String reverse(String str) {
		String x="";
		for(int i=str.length()-1;i>=0;i--)
			x=x+str.charAt(i);
		return x;
	}
	public static void main(String[] args) {
		String str="Welcome to Coding Ninjas";
		System.out.println(reverseEachWord(str));
	}

}
