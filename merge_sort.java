public class solution {

    public static void merge(int[] left,int[] right,int[] input){
        int larray = left.length;
        int rarray = right.length;
        int i = 0,j = 0,k = 0;
        while(i<larray && j<rarray){
            if(left[i]<=right[j]){
                input[k] = left[i];
                k++;
                i++;
            }
            else{
                input[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<larray){
            input[k] = left[i];
            k++;
            i++;
        }
        while(j<rarray){
            input[k] = right[j];
            k++;
            j++;
        }
    }
    
	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length<2){
            return;
        }
        int mid = input.length/2;
        int left[] = new int[mid];
        int right[] = new int[input.length-mid];
        for(int i=0;i<mid;i++){
            left[i] = input[i];
        }
        for(int i=mid;i<input.length;i++){
            right[i-mid] = input[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,input);
	}
}
