package constructors_in_java;

public class Atul {
	Atul(String n){
		System.out.println("Hello !!" +n);
	}
	Atul(String a,String b){
		System.out.println("Hii "+ a + b );
	}

	public static void main(String[] args) {
		Atul x = new Atul("Atul");
		Atul x1 = new Atul("Atul"," Mehak");
		

	}

}
