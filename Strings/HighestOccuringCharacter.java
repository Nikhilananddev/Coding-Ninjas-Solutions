import java.util.HashMap;

public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String str) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i),1);
			}
		}
		int max=Integer.MIN_VALUE;
		char maxChar='\0';
		for(int i=0;i<str.length();i++) {
			if(max<map.get(str.charAt(i))) {
				max=map.get(str.charAt(i));
				maxChar=str.charAt(i);
			}
		}
		return maxChar;
				
		
		
	}
	
	public static void main(String[] args) {
		String str="abdefgbabfba";
		System.out.println(highestOccuringCharacter(str));
		str="xy";
		System.out.println(highestOccuringCharacter(str));
	}

}
