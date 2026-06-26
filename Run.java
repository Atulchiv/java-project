package constructors_in_java;

public class Run {
	Run(String n){
		System.out.println("Hello " +n);
	}
	Run(String a,String b){
		System.out.println("Hii " +a +b);
	}
	Run(){
		System.out.println();
	}
	void  area(int a,int b){
		System.out.println("Area of triangle" +0.5*a*b);
	
	}

	public static void main(String[] args) {
		Run a = new Run("atul");
		Run b = new Run("Atul","  Rohit");

		Run c = new Run();
		c.area(2, 3);
		

	}

}
