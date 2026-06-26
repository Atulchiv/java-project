package java_project;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> students = new LinkedHashMap<Integer, String>();
		students.put(101, "Rahul");
		students.put(102, "amit");
		students.put(103, "vishal");
		students.put(104, "rahul");
		
		System.out.println(students);
	}

}
