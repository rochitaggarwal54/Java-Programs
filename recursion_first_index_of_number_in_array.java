
public class Solution {
    public static int firstIndex(int input[],int index,int x){
        if(input[index] == x){
            return index;
        }
        if(index >= input.length-1){
            return -1;
        }
        int result = firstIndex(input,index+1,x);
        return result;
    }

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int result = firstIndex(input,0,x);
        return result;
	}
	
}