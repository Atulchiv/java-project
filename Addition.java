package constructors_in_java;

public class Addition {
	Addition(int a,int b){
		System.out.println("Addition = "+(a+b));
	}

	public static void main(String[] args) {
		Addition obj = new Addition(10,20);
		Addition obj2 = new Addition(15,20);

	}

}
