public class Solution {
  
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        
        if(input.length == 0){
            return false;
        }
        int smallInput[] = new int[input.length-1];
        for(int i=0;i<input.length-1;i++){
            smallInput[i] = input[i];
        }
        if(input[input.length-1] == x){
            return true;
        }
        boolean result = checkNumber(smallInput,x);
        return result;
        
	}
}