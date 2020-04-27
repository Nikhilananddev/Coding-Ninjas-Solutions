import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        
        for(int i=1;i<=n;i++){
            
            int oddNum=2*i-1;
            for(int j=1;j<=n;j++){
                System.out.print(oddNum);
                oddNum+=2;
                
                if(oddNum==(2*n+1)){
                    oddNum=1;
                }
                
            }
            System.out.println();
            
        }
        
	}
}
