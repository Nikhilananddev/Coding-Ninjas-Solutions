
public class CheckPalindrome {

	public static boolean checkPalindrome(String str) {

		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str="MoMnoM";
		System.out.println(checkPalindrome(str));
	}
}
