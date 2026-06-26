package java_project;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> students = new LinkedHashSet<String>();
		students.add("Atul");
		students.add("Priya");
		students.add("Mehak");
		students.add("Atul");
		System.out.println(students);

	}

}
