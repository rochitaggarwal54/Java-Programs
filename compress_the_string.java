/*Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".*/






public class Solution {

	public static String compress(String inputString) {
		// Write your code here
        String result = "";
        result = result+inputString.charAt(0);
        int count = 1;
        for(int i=1;i<inputString.length();i++){
            if(inputString.charAt(i) == inputString.charAt(i-1)){
                count++;
            }
            else{
                if(count == 1){
                    result = result+inputString.charAt(i);
                }
                else{
                    result = result+count;
                    result = result+inputString.charAt(i);
                }
                count = 1;
            }
        }
        return result;
	}

}