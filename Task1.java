package java_project;

import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter any number");
		a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
