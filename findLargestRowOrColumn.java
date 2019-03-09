
public class Solution {

	
	public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        
        int row = input.length;
        int col = input[0].length;
        int max = 0,total = 0,r = 0;
        for(int i=0;i<row;i++){
            total = 0;
            for(int j=0;j<col;j++){
                total = total+input[i][j];
            }
            if(total>max){
                max = total;
                r = i;
            }
        }
        int total1 = 0,max1 = 0,c = 0;
        for(int i=0;i<col;i++){
            total1 = 0;
            for(int j=0;j<row;j++){
                total1 = total1+input[j][i];
            }
            if(total1>max1){
                max1 = total1;
                c = i;
            }
        }
        if(max == max1){
            System.out.println("row "+r+" "+max);
        }
        else if(max>max1){
            System.out.println("row "+r+" "+max);
        }
        else{
            System.out.println("column "+c+" "+max1);
        }

	}

	
}
