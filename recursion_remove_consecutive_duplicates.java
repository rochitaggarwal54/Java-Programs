public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() == 0){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        String ans = "";
        if(s.charAt(0) == s.charAt(1)){
            return ""+removeConsecutiveDuplicates(s.substring(1));
        }
        ans = ans+s.charAt(0);
        return ans+removeConsecutiveDuplicates(s.substring(1));
	}

}