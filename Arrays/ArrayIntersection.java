import java.util.HashMap;

public class ArrayIntersection {


	public static void arrayIntersection(int[] arr1,int[] arr2) {

		for(int i=0;i<arr1.length;i++) {

			for(int j=0;j<arr2.length;j++) {

				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j]=Integer.MAX_VALUE;
					break;
				}

			}

		}

	}


	public static void arrayIntersectionBest(int[] arr1,int[] arr2) {

		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i : arr1) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}else {
				map.put(i,1);
			}
		}
		for(int j : arr2) {

			if(map.containsKey(j) && map.get(j)!=0  ) {
				System.out.println(j);
				map.put(j, map.get(j)-1);
			}

		}




	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=Array.takeInput();
		int[] arr2=Array.takeInput();

		arrayIntersectionBest(arr1, arr2);

	}

}
