import java.util.*;
public class SubSequences {
	
	
	public static ArrayList<String> gss(String str) {
		
		if(str.length() == 0) {
			ArrayList<String>al = new ArrayList<String>();
			al.add(" ");
			return al;
		}
		
		
		
		char ch = str.charAt(0);
		String ores = str.substring(1);
		ArrayList<String>rr = gss(ores);
		ArrayList<String>mr = new ArrayList<String>();
		for(String s : rr) {
			mr.add(s);
			mr.add(ch+s);
		}
		return mr;
	}
	
	public static void main(String[] args) {
		System.out.println(gss("abc"));
	}
}
