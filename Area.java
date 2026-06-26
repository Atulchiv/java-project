package constructors_in_java;

public class Area {
	Area(int r){
		System.out.println("Area of the circle =" +3.14*r*r);
	}
	Area(double b,double h){
		System.out.println("Area of triangle ="+0.5*b*h);
	}
	Area(double s){
		System.out.println("Area of square =" +s*s);
	}
	Area(int l,int m){
		System.out.println("Area of rectangle ="+l*m);
	}

	public static void main(String[] args) {
		Area x = new Area(8);
		Area y = new Area(2.0, 3.0);
		Area q = new Area(5.0);
		Area r = new Area(6, 8);

	}

}
