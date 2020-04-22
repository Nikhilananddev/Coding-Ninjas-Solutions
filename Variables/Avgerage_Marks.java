import java.util.Scanner;

public class Avgerage_Marks {
	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in); 
      int marks1=scan.nextInt();
      int marks2=scan.nextInt();
      int marks3=scan.nextInt();
      String name=scan.next();
      int avg=(marks1+marks2+marks3)/3;
      System.out.println("Name: " + name);
      System.out.println("Avg Marks: "+avg);
	}
}
