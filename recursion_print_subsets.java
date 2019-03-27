import java.util.*;

public class SubSets {
	
	public static ArrayList<String> printSubsets(String str){
		
		if(str.length() == 0) {
			ArrayList<String>al = new ArrayList();
			al.add(" ");
			return al;
		}
		
		char ch = str.charAt(0);
		String ores = str.substring(1);
		ArrayList<String>rr = printSubsets(ores);
		ArrayList<String>mr = new ArrayList<String>();
		for(String rmr : rr) {
			mr.add(rmr);
			mr.add(ch+rmr);
		}
		return mr;
		
	}
	
	public static void main(String[] args) {
		System.out.println(printSubsets("234"));
	}
}
