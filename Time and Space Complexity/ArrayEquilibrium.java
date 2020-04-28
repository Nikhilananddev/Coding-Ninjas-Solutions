public class ArrayEquilibrium{	
	
	public static int arrayEquilibrium(int[] arr){  
        int rightSum=0;
        for(int i=0;i< arr.length;i++){
            rightSum+=arr[i];
        }
        //full array total sum
        
        int leftSum=0;
        
        for(int i=0;i<arr.length;i++){
            
            rightSum-=arr[i];               // totalsum-arr[i]
            if(leftSum==rightSum){           // check leftSum==rightSum
                return i;
            }
            
            leftSum+=arr[i];            // next element leftSum
             
        }
        return -1;
        
        
	}
}