package week3HomeAssignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] arr= {3,2,11,4,6,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The sorted Array :" + arr[i]);
		}
		
		System.out.println("The second Largest element is " + arr[arr.length-2]);

	}

}
