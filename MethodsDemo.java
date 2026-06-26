package java_project;

public class MethodsDemo {
	//Default Method
	public void siri() {
		System.out.println("Hey How Are You?");
	}
	//Parameters with arguments method
	public void add(int a,int b) {//Parameters
		System.out.println(a + b);
	}
	//method with retuen type
	static int square(int n) {
		return n*n;
	}
	//basic program even and odd with method
	static void checkEvenOdd(int n) {
		if(n % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.siri();
		obj.add(12, 75);//Agruments
	    System.out.println(square(4));
	    checkEvenOdd(8);

	}

}
