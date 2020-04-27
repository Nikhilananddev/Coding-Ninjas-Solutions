import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=1;i<=n;i++){
            
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        
	}
}
