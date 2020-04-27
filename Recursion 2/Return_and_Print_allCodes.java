
public class Return_and_Print_allCodes {

	public static String[] returnAllCodes(String str) {

		if(str.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns1=returnAllCodes(str.substring(1));
		char firstChar= (char)(str.charAt(0)-'0' + 'a' -1);
		for(int i=0;i<smallAns1.length;i++) {
			smallAns1[i]= firstChar + smallAns1[i];
		}
		String[] smallAns2=new String[0];
		if(str.length()>=2) {
			char firstTwoChar=(char)( (str.charAt(0) -'0') * 10 + (str.charAt(1)-'0') +'a' -1);
			if(firstTwoChar>='a' && firstTwoChar<='z') {
				smallAns2=returnAllCodes(str.substring(2));
				for(int i=0;i<smallAns2.length;i++) {
					smallAns2[i]=firstTwoChar + smallAns2[i];
				}
			}	
		}
		String[] ans =new String[smallAns1.length + smallAns2.length];
		for(int i=0;i<smallAns1.length;i++) {
			ans[i]=smallAns1[i];
		}
		for(int i=smallAns1.length;i<ans.length;i++) {
			ans[i]=smallAns2[i-smallAns1.length];
		}
		return ans;
	}

	public static void printAllCodes(String str) {
		printAllCodes(str,"");
	}
	public static void printAllCodes(String str,String output) {


		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		char firstChar=(char)( (str.charAt(0)-'0' +'a' -1) );
		printAllCodes(str.substring(1), output + firstChar);
		if(str.length() >=2) {
			char firstTwoChar= (char)( (str.charAt(0) -'0')*10 +(str.charAt(1)-'0') + 'a' -1  );

			if(firstTwoChar >='a' && firstTwoChar <='z') {
				printAllCodes(str.substring(2), output + firstTwoChar);
			}

		}

	}

	public static void main(String[] args) {
		String str="35411";
		//		String[] ans=returnAllCodes(str);
		//		for(String s : ans) {
		//			System.out.println(s);
		//		}
		printAllCodes(str);
	}
}
