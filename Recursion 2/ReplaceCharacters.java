
public class ReplaceCharacters {
	
	
	public static String replaceCharacters(String str,char c1,char c2) {
		
		if(str.length()==0) {
			return str;
		}
		
		String smallAns=replaceCharacters(str.substring(1), c1, c2);
		if(str.charAt(0)==c1) {
			return c2 + smallAns;
		}
		
		return str.charAt(0) + smallAns;
		
	}
	
	public static void main(String[] args) {
		
		String str="Nikhil";
		System.out.println(replaceCharacters(str, 'i', 'a'));
		
	}
}
