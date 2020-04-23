package Fraction;

public class Fraction {
	
	private int num;
	private int deno;
	
	public Fraction(int num,int deno) throws ZeroDenominatorException {
		
		this.num=num;
		if(deno==0) {
			throw new ZeroDenominatorException();
		}
		this.deno=deno;
		simplify();
		
	}
	
	private void simplify() {
		int gcd=1;
		for(int i=1;i<=Math.min(num, deno);i++) {
			if(num%i==0 && deno%i==0) {
				gcd=i;
			}
		}
		num=num/gcd;
		deno=deno/gcd;
	}
	public void print() {
		if(deno==1) {
			System.out.println(num);
		}
		else {
			System.out.println(num+"/"+deno);
		}
	}
	public int getNum() {
		return num;
	}
	public int getDeno() {
		return deno;
	}
	public void setDeno(int deno) throws ZeroDenominatorException {
		if(deno==0) {
			throw new ZeroDenominatorException();
		}
		this.deno=deno;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void add(Fraction f) {
	   int num=this.num*f.deno + f.num*this.deno;
	   int deno=this.deno*f.deno;
	   this.num=num;
	   this.deno=deno;
	   simplify();
	}
	public void multiply(Fraction f) {
		int num= this.num * f.num;
		int deno=this.deno*f.deno;
		this.num=num;
		this.deno=deno;
		simplify();	
	}
	public static Fraction add(Fraction f1,Fraction f2) throws ZeroDenominatorException {                 // method overloading (Same function name with different arguments.
		
		int num=f1.num*f2.deno + f2.num * f1.deno;
		int deno=f1.deno * f2.deno;
		Fraction f=new Fraction(num, deno);
		return f;
		
	}
	
	public static Fraction multiply(Fraction f1,Fraction f2) throws ZeroDenominatorException {
		int num=f1.num*f2.num;
		int deno=f1.deno*f2.deno;
		Fraction f=new Fraction(num, deno);
		return f;
	}
}
