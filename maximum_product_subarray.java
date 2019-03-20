/*Given an array A[] that contains both positive and negative integers, find the maximum product subarray.
*/


import java.util.*;

public class MaximumProductSubarray {
	
	public static void maxProductSubarray(int[] arr) {
		int maximum = 1;
		int minimum = 1;
		int maximum_ending_here = 0;
		int max_so_far = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				maximum = 1;
				minimum = 1;
				if(max_so_far<0) {
					max_so_far = 0;
				}
			}
			int f2 = arr[i] * minimum;
			int f3 = arr[i] * maximum;
			minimum = Math.min(arr[i],Math.min(f2,f3));
			maximum = Math.max(arr[i],Math.max(f2,f3));
			maximum_ending_here = Math.max(minimum, maximum);
			if(maximum_ending_here>max_so_far) {
				max_so_far = maximum_ending_here;
			}
		}
		System.out.println(max_so_far);
	}
	
	public static void main(String[] args) {
		int arr[] = {6,-3,-10,0,2};
		maxProductSubarray(arr);
	}
}
