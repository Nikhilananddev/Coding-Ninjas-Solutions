
public class Return_and_Print_permutations {

	public static String[] permutations(String str) {

		if(str.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns=permutations(str.substring(1));
		String[] ans= new String[smallAns.length * str.length()];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<str.length();j++) {
				ans[k++]=smallAns[i].substring(0,j) + str.charAt(0)+ smallAns[i].substring(j); 
			}
		}
		return ans;

	}
	
	public static void printPermutations(String str) {
		printPermutations(str,"");
	}
	public static void printPermutations(String str,String output) {
		
		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			printPermutations(  str.substring(0 , i) + str.substring(i+1) , output + str.charAt(i));
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String str="abc";
//		String[] ans=permutations(str);
//		for(String i : ans) {
//			System.out.println(i);
//		}

		printPermutations(str);
	}

}
