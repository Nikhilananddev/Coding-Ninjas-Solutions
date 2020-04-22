
public class CountWords {
	
	
	public static int countWords(String str) {
		int words=1;
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)==' ') {
				words++;
			}
			
			
		}
		return words;
		
	}
	public static void main(String[] args) {
		String str="This is my Kingdom";
		System.out.println(countWords(str));
	}
}
