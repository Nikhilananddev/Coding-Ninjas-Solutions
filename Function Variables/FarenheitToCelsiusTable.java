
public class FarenheitToCelsiusTable {


	public static void printFahrenheitTable(int start,int end,int step) {

		for(int i=start;i<=end;i+=step) {

			System.out.println( i +"\t" + (int)((5.0/9)*(i-32)) );
		}

	}

	public static void main(String[] args) {
		
		printFahrenheitTable(0, 100, 20);

	}

}
