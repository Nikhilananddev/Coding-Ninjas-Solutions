import java.util.Arrays;
import java.util.HashMap;

public class Triplet {

	public static void printInOrder(int a,int b,int c) {

		if(a>=b && a>=c && b>=c) {
			System.out.println(c+" " +b+" "+a);
		}else if(a>=b && a>=c && c>=b) {
			System.out.println(b+" " +c+" "+a);
		}else if(b>=a && b>=c && a>=c) {
			System.out.println(c+" " +a+" "+b);
		}else if(b>=a && b >=c && c>=a) {
			System.out.println(a+" " +c+" "+b);
		}else if(c>=a && c>=b && a>=b) {
			System.out.println(b+" " +a+" "+c);
		}else if(c>=a && c>=b && b>=a) {
			System.out.println(a+" " +b+" "+c);
		}


	}

	public static void tripletSum(int[] arr,int sum) {

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i] + arr[j] +arr[k]==sum){
						printInOrder(arr[i],arr[j],arr[k]);
					}
				}
			}
		}
	}

		

	}
