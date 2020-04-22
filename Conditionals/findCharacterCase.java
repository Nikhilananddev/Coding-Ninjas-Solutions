import java.util.Scanner;

public class findCharacterCase {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char c=str.charAt(0);
		if(c>='A' && c<='Z') {
			System.out.println(1);
		}else if(c>='a' && c<='z') {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		

	}
}
