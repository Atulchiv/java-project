package java_project;

import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Enter a number");
		n = sc.nextInt();
		int sum = 0;
		for(i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(n + sum);

	}

}
