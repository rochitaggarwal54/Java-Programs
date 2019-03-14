import java.lang.Math;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0){
            return 1;
        }
        double result = findGeometricSum(k-1);
        result = result+1/Math.pow(2,k);
        return result;
	}
}