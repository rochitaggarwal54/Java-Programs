/*Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".*/





public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
        if(input.length() == 0){
            return "";
        }
        if(input.length() == 1){
            return input.charAt(0)+"";
        }
        if(input.substring(0,2).equals("pi")){
            return "3.14" + replace(input.substring(2));
        }
        return input.charAt(0)+replace(input.substring(1));
	}
}
