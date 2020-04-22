import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		for(int i=S;i<=E;i+=W) {
			int cels=(int)((5.0/9)*(i-32));
			System.out.println(i+" "+cels);
		}
	}
}