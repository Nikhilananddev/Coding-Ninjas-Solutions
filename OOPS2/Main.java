package ExceptionHandling;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
			//			throw new DenoMinatorZeroException();
			//		}
			//		System.out.println(n);
			//		
			try {
//				System.out.println(n);
				check(n);
			}
			
			catch(DenoMinatorZeroException e) {
				System.out.println("Zero");
			}
			catch(Exception e) {
				System.out.println("None");
			}
			finally {
				System.out.println(n);
			}

		




	}

	public static void check(int n) throws Exception {
		// TODO Auto-generated method stub
		if(n==0) {
			throw new DenoMinatorZeroException();
		}
		if(n<0) {
			throw new Exception("Negetive Number");
		}
		System.out.println(n);

	}
}