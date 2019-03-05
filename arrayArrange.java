public class Solution {

	
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/			
        int arr[] = new int[n];
        int i=0,j = n-1,num = 1;
        while(i<j){
            arr[i] = num;
            i++;
            num++;
            arr[j] = num;
            j--;
            num++;
        }
        if(i == j){
            arr[i] = num;
        }
        return arr;
	}
	
}
