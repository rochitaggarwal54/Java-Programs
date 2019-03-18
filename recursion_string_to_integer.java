/*Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.*/





public class solution {

    static int s = 0;
	public static int convertStringToInt(String input){
		// Write your code here
        if(input.length() == 0){
            return s;
        }
        s = s*10+input.charAt(0)-48;
        s = convertStringToInt(input.substring(1));
        return s;
	}
}
