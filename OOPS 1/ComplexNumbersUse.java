package ComplexNumbers;

public class ComplexNumbersUse {

	public static void main(String[] args) {
		
		ComplexNumbers c=new ComplexNumbers(5, 6);
		c.multiply(new ComplexNumbers(1, 1));
		c.conjugate().print();
		
	}

}
