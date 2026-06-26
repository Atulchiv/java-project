package java_project;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(101, "Rahul");
		students.put(102, "amit");
		students.put(103, "vishal");
		students.put(104, "rahul");
		
		System.out.println(students);
	}

}
