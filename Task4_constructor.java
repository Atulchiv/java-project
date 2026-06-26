package java_project;

public class Task4_constructor {
	//find square
	public static int Task4_constructor(int n){
		return n*n;
	}
	//student name and age
	Task4_constructor(String name,int age){
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
	}
	//check even odd
	static void checkEvenOdd(int a) {
	
		if(a % 2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	//Default constructors
	Task4_constructor(){
		System.out.println("Defalut Employee");
	}
	//parameter with argument
	Task4_constructor(String name){
		System.out.println("Employee Name : " + name);
	}
	//parameter constructor
	Task4_constructor(int salary,String name){
		System.out.println("Employee Name : " + name);
		System.out.println("Salary : " + salary);
	}
	 //largest no find 
	int Task4_constructor(int a,int b) {
		 if (a > b) {
	            return a;
	        } else {
	            return b;
	        }
	}
	public static void main(String[] args) {
		System.out.println(Task4_constructor(8));
		Task4_constructor obj1 = new Task4_constructor("Atul", 22);
		checkEvenOdd(5);
		Task4_constructor obj2 = new Task4_constructor();
		Task4_constructor obj3 = new Task4_constructor("Atul");
		Task4_constructor obj4 = new Task4_constructor(500000, "Priya");
		Task4_constructor obj5 = new Task4_constructor();
		int result = obj5.Task4_constructor(25 , 40);
		System.out.println("Task4_constructor : " + result);
		}
}
