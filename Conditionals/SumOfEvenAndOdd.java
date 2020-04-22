import java.util.Scanner;

public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int oddSum=0,evenSum=0;
		while(n>0) {
			int a=n%10;
			if(a%2==0) {
				evenSum+=a;
			}else {
				oddSum+=a;
			}
			n=n/10;
		}
		System.out.println("Even Sum= "+evenSum);
		System.out.println("Odd Sum="+oddSum);
	}
	
}
