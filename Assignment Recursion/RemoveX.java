
public class RemoveX {

	
	public static String removeX(String str) {
		
		if(str.length()==0) {
			return str;
		}
		String smallAns= removeX(str.substring(1));
		if(str.charAt(0)=='x') {
			return smallAns;
		}
		return str.charAt(0) + smallAns;
	}
	
	public static void main(String[] args) {
		
		String str="xaxb";
		System.out.println(removeX(str));
		
	}
}
