import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum+=j;
                System.out.print(j);
				if(j!=i){
                    System.out.print("+");
                }
            }
            System.out.println("="+sum);
            
            
        }
        
        
	}
}
