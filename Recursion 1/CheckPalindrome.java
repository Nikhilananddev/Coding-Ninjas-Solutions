
public class CheckPalindrome {
	
	public static boolean checkPalindrome(String str,int start) {
		
		if(start == str.length() /2) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(str.length()-start-1)) {
			return false;
		}
		return checkPalindrome(str, start + 1);
	}
	public static boolean checkPalindrome(String str) {
		return checkPalindrome(str, 0);
	}
	public static void main(String[] args) {
		String str="NikhkiN";
		System.out.println(checkPalindrome(str));
	}

}
