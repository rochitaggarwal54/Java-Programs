import java.util.*;

public class KeypadCombinations {
	
	static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static ArrayList<String> keypad(String str){
		if(str.length() == 0) {
			ArrayList<String>al = new ArrayList<String>();
			al.add("");
			return al;
		}
		char ch = str.charAt(0);
		String ores = str.substring(1);
		ArrayList<String>rr = keypad(ores);
		ArrayList<String> mr = new ArrayList<String>();
		String code = codes[ch-'0'];
		for(int i=0;i<code.length();i++) {
			for(String rstr : rr) {
				mr.add(code.charAt(i)+rstr);
			}
		}
		return mr;
	}
	
	public static void main(String[] args) {
		System.out.println(keypad("12"));
	}
}
