

/*Aahad and Harshit were discussing problems on Arrays. Harshit gave a challenge to Aahad. He says: "Aahad, you are given an array of integers and target number. You have to print true if there is a pair whose difference is same as target number and false otherwise."
You have to help Aahad solve this problem.*/






import java.util.*;
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
        int x = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = 1;
        int flag = 0;
        while(start<arr.length && end<arr.length){
            int diff = arr[end] - arr[start];
            if(diff<x){
                end++;
            }
            else if(diff>x){
                start++;
            }
            else{
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
	}

}