package java_project;

class Employee1{
	void work() {
		System.out.println("Employing is creatinga new software");
	}
}
class Developer{
	void work() {
		System.out.println("Developer is developed the website");
	}
}
public class Task_polymorphism2 {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.work();
		Developer d = new Developer();
		d.work();

	}

}
