package Fraction;

public class FractionUse {

	public static void main(String[] args) throws ZeroDenominatorException {
		Fraction f1=new Fraction(5, 10);
		Fraction f2=new Fraction(10,50);
		f1.multiply(f2);
		f1.print();
		Fraction f= Fraction.multiply(f1, f2);
		
		f.print();
	}

}
