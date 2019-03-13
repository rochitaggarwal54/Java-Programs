
public class Solution {

    public static int lastIndex(int input[],int lastIndex,int x){
        
        if(lastIndex < 0){
            return -1;
        }
        
        if(input[lastIndex] == x){
            return lastIndex;
        }
        
        int result = lastIndex(input,lastIndex-1,x);
        return result;
    }
    
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int result = lastIndex(input,input.length-1,x);
        return result;
	}
	
}