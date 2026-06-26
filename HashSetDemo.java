package java_project;

import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> students = new HashSet<String>();
		students.add("Atul");
		students.add("Priya");
		students.add("Mehak");
		students.add("Atul");
		System.out.println(students);

	}

}
