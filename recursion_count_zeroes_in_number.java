
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input == 0){
            return 0;
        }
        int result = countZerosRec(input/10);
        if(input%10 == 0){
            result = result+1;
        }
        return result;
	}
}
