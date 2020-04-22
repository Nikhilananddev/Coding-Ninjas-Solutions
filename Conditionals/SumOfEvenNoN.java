import java.util.Scanner;

public class SumOfEvenNoN {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i+=2) {
			sum+=i;
		}
		System.out.println(sum);

	}
}
