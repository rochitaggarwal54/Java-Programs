public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
      String words[] = input.split(" ");
      int k = 0;
      String result = "";
      for(int i=words.length-1;i>=0;i--){
        String word = words[i];
        result = result+word;
        if(k<words.length-1){
          result = result+" ";
          k++;
        }
      }
      return result;
	}
}
