
public class RemoveDuplicates {
	
	public static String removeDuplicates(String str) {
		
		if(str.length()==1) {
			return str;
		}
		String smallAns=removeDuplicates(str.substring(1));
		
		if(smallAns.charAt(0)==str.charAt(0)) {
			return smallAns;
		}
		return str.charAt(0) + smallAns;
 		
	}
	public static void main(String[] args) {
		String str="aabbbaacccba";
		System.out.println(removeDuplicates(str));
	}

}
