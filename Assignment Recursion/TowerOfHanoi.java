
public class TowerOfHanoi {
	
	
	public static void towerOfHanoi(int n,char from , char aux,char to) {
		
		if(n==0) {
			return ;
		}
		towerOfHanoi(n-1,from,to,aux);
		System.out.println(from +" " + to);
		towerOfHanoi(n-1,aux,from,to);
		
		
	}
	
	
	public static void main(String[] args) {
		towerOfHanoi(3, 'A', 'B', 'C');
	}

}
