package java_project;

//Single-Inheritance
class Dad{
	public void House() {
		System.out.println("1cr");
	}
	public void car() {
		System.out.println("Skoda Octavia");
	}
}

public class Child extends Dad {

	public static void main(String[] args) {

		Child Atul = new Child();
		Atul.House();
		Atul.car();
	}

}
