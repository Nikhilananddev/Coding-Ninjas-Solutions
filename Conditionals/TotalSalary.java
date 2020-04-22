import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int bs=scan.nextInt();
		String grade=scan.next();
		double hra=0.2*bs;
		double da=0.5*bs;
		int allow=1300;
		if(grade.charAt(0)=='A') {
			allow=1700;
		}
		else if(grade.charAt(0)=='B') {
			allow=1500;
		}
		double pf=0.11*bs;

		int totalSalary=(int)(Math.round(bs+hra+da+allow-pf));
		System.out.println(totalSalary);

	}

}
