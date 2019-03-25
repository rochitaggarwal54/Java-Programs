// highest occurring character in the String.
import java.util.*;
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
        HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        for(int i=0;i<inputString.length();i++){
            if(hm.containsKey(inputString.charAt(i))){
                hm.put(inputString.charAt(i),hm.get(inputString.charAt(i))+1);
            }
            else{
                hm.put(inputString.charAt(i),1);
            }
            if(hm.get(inputString.charAt(i))>max){
                maxChar = inputString.charAt(i);
                max = hm.get(inputString.charAt(i));
            }
        }
        return maxChar;
	}
}
