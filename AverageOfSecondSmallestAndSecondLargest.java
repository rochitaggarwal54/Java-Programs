/*Write a java program to find the second largest and second smallest number in the list and compute the average of these two numbers. Then check if this average exists in the list or not. If exists then how many times it has occurred in the list.

Input Format
The input consists of n integers.
The first line corresponds to n, the number of elements to be added in the list.
The remaining integers correspond to the elements in the list.
(Refer Sample Input below for explanation)

Output Format
The first line of output denotes the second largest and second smallest element separated by space.
The second line display the average of these two numbers and next line must contain the count value i.e. 0 (zero) if average does not exist in the array otherwise the count value means how much time average value occurs in the array.
(Refer Sample Output below for explanation)

Sample Input 1
5
388
345
444
416
654
Sample Output 1
444 388
416
1
*/







package algorithms;
import java.util.*;

public class AverageOfSecondSmallestAndSecondLargest {
		static public int returnAverage(List<Integer>al){
			int l = al.size();
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			for(int i=0;i<l;i++){
				if(al.get(i)>max1){
					max2 = max1;
					max1 = al.get(i);
				}
				else if(al.get(i)>max2 && al.get(i)!=max1){
					max2 = al.get(i);
				}
			}
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			for(int i=0;i<l;i++){
				if(al.get(i)<min1){
					min2 = min1;
					min1 = al.get(i);
				}
				else if(al.get(i)<min2 && al.get(i)!=min1){
					min2 = al.get(i);
				}
			}
			System.out.print(max2+" "+min2);
			System.out.println();
			int average = (max2+min2)/2;
			return average;
		}
		static public int findAverageInList(List<Integer>al1,int avg){
			int total = 0;
			int flag = 0;
			int l1 = al1.size();
			for(int i=0;i<l1;i++){
				if(al1.get(i) == avg){
					flag = 1;
					total = total+1;
				}
			}
			if(flag == 1){
				return total;
			}
			else{
				return 0;
			}
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			List<Integer>li = new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int num = sc.nextInt();
				li.add(num);
			}
			int avg = returnAverage(li);
			System.out.println(avg);
			int count = findAverageInList(li,avg);
			System.out.println(count);
	}
}