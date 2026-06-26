package java_project;

class Parent{
	public void house() {
		System.out.println("2BHK");
	}
}
class Sister extends Parent{
	
}

public class Brother extends Parent {

	public static void main(String[] args) {
		Brother obj = new Brother();
		obj.house();
		
	}

}
