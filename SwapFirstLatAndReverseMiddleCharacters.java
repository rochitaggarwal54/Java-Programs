package algorithms;

import java.io.*;

public class SwapFirstLatAndReverseMiddleCharacters{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		String words[] = str.split("\\s");
		int l = words.length;
		String result = "";
		result = result+words[l-1];
		result = result+" ";
		for(int i=l-2;i>0;i--)
		{
			String s = words[i];
			int sl = s.length();
			for(int j=sl-1;j>=0;j--)
			{
				result = result+s.charAt(j);
			}
			result = result+" ";
		}
		result = result+words[0];
		System.out.println(result);
	}
}
