package java_project;

import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<String>();
		books.push("Java");
		books.push("Python");
		books.push("C++");
		System.out.println("Books in stack :" + books);
		//top book
		System.out.println("Top book :" + books.peek());
		//remove book
		System.out.println("Removed Book : " + books.pop());
		//remaining books
		System.out.println("Remaining Books : " + books);
	}

}
