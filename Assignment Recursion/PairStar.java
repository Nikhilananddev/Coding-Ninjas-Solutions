
public class PairStar {
	
	
	public static String pairStar(String str) {
		
		if(str.length()==1) {
			return str;
		}
		String smallAns=pairStar(str.substring(1));
		if(smallAns.charAt(0) == str.charAt(0)) {
			return str.charAt(0) +"*"+smallAns;
		}
		return str.charAt(0) + smallAns;
		
	}

	public static void main(String[] args) {
		
		String str="xxyyx";
		System.out.println(pairStar(str));

	}

}
