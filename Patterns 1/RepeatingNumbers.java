
public class RepeatingNumbers {

    public static void print(int n) {
        //Write your code here
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=Math.pow(2,i-1);j++){
                System.out.print(val++);
                if(val==10){
                    val=1;
                }
            }
            System.out.println();
        }

    }

}
