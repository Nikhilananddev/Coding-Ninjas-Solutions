
public class StudentUse {

	public static void main(String[] args) {
		
		Student s1=new Student("Nikhil",63,97.8);
		Student s2=new Student("Rahul",65,99);
		Student s3=new Student("Uttirna");
		Student s4=new Student("Tarun",62);
		
		System.out.println(Student.getCountStudents()); 
		// static functions/attribute are class bounded attributes they are not dependent on objects.
		

		

	}

}
