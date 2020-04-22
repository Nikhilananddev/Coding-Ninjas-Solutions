import java.util.Scanner;

public class whileLoop {
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		int n=scan.nextInt();
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
}
