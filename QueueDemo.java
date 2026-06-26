package java_project;

import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();
		names.add("Atul");
		names.add("priya");
		names.add("Mehak");
		System.out.println(names.peek());
		System.out.println(names);
	}

}
