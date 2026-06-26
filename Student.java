package java_project;

public class Student {
	Student(){
		System.out.println("Default");
	}
	Student(String name){
		System.out.println("Name :" + name);
	}
	Student(String name,int age){
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}

	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1= new Student("Priya");
		Student obj2 = new Student("Atul", 22);
				

	}

}
