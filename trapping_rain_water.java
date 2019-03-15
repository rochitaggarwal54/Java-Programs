/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.*/





import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(arr[i],right[i+1]);
        }
        int water = 0;
        for(int i=1;i<n-1;i++){
            water = water+Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(water);
	}

}