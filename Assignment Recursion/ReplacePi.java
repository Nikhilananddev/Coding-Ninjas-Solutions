 public class ReplacePi{
	 
	 public static String replacePi(String str) {
		 if(str.length()==1) {
			 return str;
		 }
		 
		 String smallAns= replacePi(str.substring(1));
		 if(str.charAt(0)=='p' && smallAns.charAt(0)=='i') {
			 return "3.14"+smallAns.substring(1);
		 }
		 return str.charAt(0) + smallAns;
 		 
		 
	 }
	 public static void main(String[] args) {
		 
		 String str= "pipiiixpi";
		 System.out.println(replacePi(str));
		
	}
	 
 }