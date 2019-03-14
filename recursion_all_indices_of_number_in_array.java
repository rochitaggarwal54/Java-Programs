
public class Solution {

    static int arr[] = new int[0];
    public static int[] allIndexes(int input[],int startIndex,int x){
        if(startIndex == input.length){
            return arr;
        }
        if(input[startIndex] == x){
            int arr1[] = new int[arr.length+1];
            for(int i=0;i<arr.length;i++){
                arr1[i] = arr[i];
            }
            arr1[arr.length] = startIndex;
            arr = arr1;
            arr = allIndexes(input,startIndex+1,x);
            return arr;
        }
        arr = allIndexes(input,startIndex+1,x);
        return arr;
        
    }
    
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return allIndexes(input,0,x);
	}
	
}