
public class ReverseStringWordWise {
	
	public static String reverseStringWordWise(String str) {
		
		String x="";
		int space=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			
			if(i==0) {
				x=x+str.substring(0,space);
			}
			
			else if(str.charAt(i)==' ') {
				x=x+str.substring(i+1,space)+" ";
				space=i;
			}
		}
		return x;
		
	}
	
	public static void main(String[] args) {
		String str="Welcome To Coding Ninjas";
		System.out.println(reverseStringWordWise(str));
	}

}
