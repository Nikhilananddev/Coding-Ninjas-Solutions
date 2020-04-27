
public class Return_and_Print_Keypad_Problem {

	// T(n)=T(n/10) + k(n^2)
	public static String[] returnKeypad(int num) {

		if(num==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns=returnKeypad(num/10);
		String[] choices= keypad(num%10);
		String[] ans= new String[choices.length * smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<choices.length;j++) {
				ans[k++]= smallAns[i] + choices[j];
			}
		}
		return ans;
	}
	
	public static void printKeypad(int num) {
		
		printKeypad(num,"");
		
	}
	public static void printKeypad(int num,String output) {
		
		if(num==0) {
			System.out.println(output);
			return;
		}
		String[] choices=keypad(num%10);
		for(int i=0;i<choices.length;i++) {
			printKeypad(num/10, choices[i] + output);
		}

	}


	private static String[] keypad(int n) {


		if(n==0 || n==1) {
			String[] ans= {""};
			return ans;
		}

		else if(n==2) {
			String[] ans= {"a","b","c"};
			return ans;
		}
		else if(n==3) {
			String[] ans= {"d","e","f"};
			return ans;
		}
		else if(n==4) {
			String[] ans= {"g","h","i"};
			return ans;
		}
		else if(n==5) {
			String[] ans= {"j","k","l"};
			return ans;
		}
		else if(n==6) {
			String[] ans= {"m","n","o"};
			return ans;
		}
		else if(n==7) {
			String[] ans= {"p","q","r","s"};
			return ans;
		}
		else if(n==8) {
			String[] ans= {"t","u","v"};
			return ans;
		}
		else if(n==9) {
			String[] ans= {"w","x","y","z"};
			return ans;
		}
		return null;
	}


	public static void main(String[] args) {
		 int num =234;
//		 String[] ans=returnKeypad(num);
//		 for(String s : ans) {
//			 System.out.println(s);
//		 }
		 printKeypad(num);
	}

}
