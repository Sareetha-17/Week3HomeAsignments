package week3HomeAssignment;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,6,7,4,8};
		int n=arr.length;
		Arrays.sort(arr);
		int sum = ((n+1)*(n+2))/2;  
	    
	     for(int i=0; i<n; i++) {
	       
	    	  sum=sum-arr[i];
	      }
	    
	      System.out.println("Missing number is: "+sum);
      
	}

}
