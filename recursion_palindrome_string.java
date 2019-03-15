
public class solution {

    public static boolean isStringPalindrome(String input,int start,int end){
        if(input.length() <=1 || start>=end){
            return true;
        }
        if(input.charAt(start) == input.charAt(end)){
            boolean result = isStringPalindrome(input,start+1,end-1);
            return result;
        }
        else{
            return false;
        }
    }
    
	public static boolean isStringPalindrome(String input) {
		// Write your code here
        boolean result = isStringPalindrome(input,0,input.length()-1);
        return result;
	}
}
