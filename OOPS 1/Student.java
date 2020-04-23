
public class Student {
	
	public final String name;
	private int roll_no;
	double percent;
	private static int countNumbers;
	
	public static int getCountStudents() {
		return countNumbers;
	}
	
	public int getRollNo() {
		return roll_no;
	}
	
	public void setRollNo(int roll_no) {
		this.roll_no=roll_no;
	}
	
	public Student(String name,int roll_no,double percent) {
		this.name=name;
		this.roll_no=roll_no;
		this.percent=percent;
		Student.countNumbers++;
	}
	public Student(String name) {
		
		this.name=name;
		Student.countNumbers++;
		
	}
	public Student(String name,int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
		Student.countNumbers++;
	}
	
	
	
	
	
}
