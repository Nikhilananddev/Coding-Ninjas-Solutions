
public class RemoveAllOccurrencesOfChar {
	
	public static String removeAllOccurrencesOfChar(String str,char c) {
		
		String x="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				x+=str.charAt(i);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		String str="Nikhil Bhasin";
		System.out.println(removeAllOccurrencesOfChar(str, 'i'));

	}

}
