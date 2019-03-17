
public class solution {

	// Return the changed string
    public static String removeX(String input,int start,String output){
        if(start == input.length()){
            return output;
        }
        if(input.charAt(start) == 'x'){
            output = output+"";
        }
        else{
            output = output+input.charAt(start);
        }
        String result1 = removeX(input,start+1,output);
        return result1;
    }
    
	public static String removeX(String input){
		// Write your code here
        String output = "";
        String result = removeX(input,0,output);
        return result;
	}
}
