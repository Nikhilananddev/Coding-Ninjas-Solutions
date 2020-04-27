
public class Return_Print_Subsequences {
	
	//O(n^2)
	public static String[] returnSubsequences(String str) {
		if(str.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns=returnSubsequences(str.substring(1));
		String[] ans=new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i]=smallAns[i];
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[smallAns.length+i]=str.charAt(0) + smallAns[i];
		}
		return ans;
	}
	
	// O(2^n)
	public static void printSubsequences(String str) {
		
		printSubsequences(str,"");

	}
	private static void printSubsequences(String str,String output) {
		
		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		printSubsequences(str.substring(1), output + str.charAt(0));
		printSubsequences(str.substring(1), output);
	
		
	}
	
	public static void main(String[] args) {
//		String[] ans= returnSubsequences("xyz");
//		for(String s : ans) {
//			System.out.println(s);
//		}
		printSubsequences("xyz");
	}

}
