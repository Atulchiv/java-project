package constructors_in_java;

public class Information_2 {
	String name;
	int age;
	Information_2(String n,int a){
		name = n;
		age = a;
	}
	void display(){
		System.out.println("Name: " +name+ " Age: "+age);
	}

	public static void main(String[] args) {
		Information_2 obj = new Information_2("Atul", 22);
		obj.display();

	}

}
