package java_project;

//Rum-time polymorphism
//method overriding
class Women{
	public void work() {
		System.out.println("Women is working");
	}
}
class Teacher{
	public void work() {
		System.out.println("Teacher is teaching");
	}
}
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		Women w = new Women();
		w.work();
		}
}
