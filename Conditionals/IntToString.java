import java.util.Scanner;
public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1) {
			System.out.println("One");
		}else if(n==2) {
			System.out.println("Two");
		}else if(n==3) {
			System.out.println("Three");
		}else {
			System.out.println("Four and Above");
		}
	}

}
