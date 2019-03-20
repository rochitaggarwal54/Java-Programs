/*Minimum swaps required to bring all elements less than or equal to k together*/





import java.util.*;

public class MinimumSwaps {
	
	public static void minimumSwapsRequired(int[] arr,int k) {
		int countKs = 0;
		int countKsInWindow = 0;
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=k) {
				countKs++;
			}
		}
		//Iterator for 1st window slide
		for(int i=0;i<countKs;i++) {
			if(arr[i]<=k) {
				countKsInWindow++;
			}
		}
		int maximumKsInWindow = countKsInWindow;
		for(int i=countKs;i<arr.length;i++) {
			if(arr[i]<=k) {
				countKsInWindow++;
			}
			if(arr[i-countKs]<=k) {
				countKsInWindow--;
			}
			if(countKsInWindow>maximumKsInWindow) {
				maximumKsInWindow = countKsInWindow;
			}
		}
		res = countKs-maximumKsInWindow;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,1,5,6,3};
		minimumSwapsRequired(arr,3);
	}
}
