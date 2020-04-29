
public class DoesSContainT {

	
	public static boolean doesScontainsT(String s,String t) {
		
		if(s.length() < t.length()) {
			return false;
		}
		
		
		int j=0;
		
		for(int i=0;i<s.length();i++) {
			if( j<t.length() && s.charAt(i)==t.charAt(j)) {
				j++;
			}
		}
		if(j==t.length()) {
			return true;
		}
		
			return false;
		
		
		
	}
	
	public static void main(String[] args) {
		String s="abchjsgsuohhdhyrikkknddg";
		String t="codings";
		System.out.println(doesScontainsT(s, t));
	}
}
