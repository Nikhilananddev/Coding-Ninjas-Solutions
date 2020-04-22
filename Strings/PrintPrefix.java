
public class PrintPrefix {
	
	public static void printPrefix(String str) {
		for(int i=1;i<=str.length();i++) {
			System.out.println(str.substring(0,i));
		}
	}
	public static void printAllSubstring(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
		
	}
	public static void main(String[] args) {
		String str="abcd";
		//printPrefix(str);
		printAllSubstring(str);
	}

}
