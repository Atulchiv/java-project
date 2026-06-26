package constructors_in_java;

public class Area_of_circle {
	double r;
	Area_of_circle(double radius){
		r = radius;
		
	}
	void circle(){
		System.out.println("Area of the circle= "+3.14*r*r);
	}
	
	public static void main(String[] args) {
		Area_of_circle obj = new Area_of_circle(2.0);
		obj.circle();
	}

}
