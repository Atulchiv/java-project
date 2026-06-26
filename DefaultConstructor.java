package constructors_in_java;

public class DefaultConstructor {
	DefaultConstructor(){
		System.out.println("this is a default constructor");
	}
	static void display(){
		System.out.println("static method");
	}
	void show()
	{
		System.out.println("instance mthod");
	}

	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		display();
		obj.show();

	}

}
