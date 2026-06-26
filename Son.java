package java_project;

//multiple inheritance
class grandfather{
	public void plot() {
		System.out.println("5cr");
	}
}
class father extends grandfather{
	public void car() {
		System.out.println("BMW");
	}
}
public class Son extends father {

	public static void main(String[] args) {
		Son atul = new Son();
		atul.plot();
		atul.car();

	}

}
