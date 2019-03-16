/*Anuj is one of the finest instructors at Coding Ninjas. He takes a batch of m students. He has been given n number of chocolate cartons. Each carton can have a variable number of chocolates. He has been given a task to distribute the chocolates to his students on the occasion of Holi. Now, here is the tricky part, he needs to distribute the chocolates in such a way that:
1. Each student gets one carton of chocolate.
2. The difference between the chocolate carton with the maximum number of chocolates and the carton with the minimum number of chocolates given to the students is minimum.*/





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
        int m = sc.nextInt();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            if(arr[i+m-1]-arr[i]<min){
                min = arr[i+m-1]-arr[i];
            }
        }
        System.out.println(min);
	}

}