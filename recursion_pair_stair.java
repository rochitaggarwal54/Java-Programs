/*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".*/




public class solution {

	// Return the updated string
    static String result = "";
	public static String addStars(String s) {
		// Write your code here
        if(s.length() == 0){
            return "";
        }
        if(s.length() == 1){
            return s.charAt(0)+"";
        }
        if(s.charAt(0) == s.charAt(1)){
            return s.charAt(0)+"*"+addStars(s.substring(1));
        }
        return s.charAt(0)+addStars(s.substring(1));
	}
}
