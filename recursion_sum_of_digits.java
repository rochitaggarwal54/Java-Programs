
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        int sum;
        if(input == 0){
            return 0;
        }
        int result = sumOfDigits(input/10);
         sum = result+(input%10);
        return sum;
        /*if(input>0){
            return input%10+sumOfDigits(input/10);
        }
        else{
            return input;
        }*/
	}
}
