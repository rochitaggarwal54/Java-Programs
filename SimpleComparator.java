package algorithms;
import java.util.*;

class Student1{
	int rollno;
	String name;
	int age;
	Student1(int roll,String nam,int ag){
		this.rollno = roll;
		this.name = nam;
		this.age = ag;
	}
}

class NameComparator implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2){
		if( s1.name.compareTo(s2.name)==0)
		{
		    return s2.age-s1.age;
		}
		else
		{
			return s1.name.compareTo(s2.name);
		}
	}
}

public class SimpleComparator {
	public static void main(String[] args){
		ArrayList<Student1>al = new ArrayList<Student1>();
		al.add(new Student1(1,"abc",19));
		al.add(new Student1(2,"xyz",20));
		al.add(new Student1(3,"abc",21));
		System.out.println("Sorting by name");
		Collections.sort(al,new NameComparator());
		for(Student1 st : al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
