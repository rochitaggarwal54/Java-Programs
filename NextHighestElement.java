/*
Given an array, print the Next Highest Element (NHE) for every element. The Next highest Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next highest element as -1.
Examples:
a) For any array, rightmost element always has next highest element as -1.
b) For an array which is sorted in decreasing order, all elements have next highest element as -1.
c) For the input array [4, 5, 2, 25], the next greater elements for each element are as follows:

Element  	 NHE
  4     	    -->	  5
  5    	    -->     25
  2            -->     25
  25          -->     -1
Input Format
First Line of the Sample Input denotes the number of elements, N of array.
Next N lines represents the array elements.
(Refer Sample Input below for the explanation)

Output Format
Display the Next Highest Element (NHE) for every element of array
(Refer Sample Output below for the explanation)

Sample Input 1
4
11
4
25
10
Sample Output 1
25
25
-1
-1

*/



package algorithms;
import java.util.*;

public class NextHighestElement {
	public static void main(String[] args){
		int max,flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			flag = 0;
			max = arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>max)
				{
					max = arr[j];
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if(flag == 0)
			{
				System.out.print(max+" ");
			}
			else if(flag == 1)
			{
				System.out.print("-1 ");
			}
		}
		System.out.print(-1);
	}
}
