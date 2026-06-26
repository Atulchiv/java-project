package java_project;

class AreaCalculator{
	public void area(int side) {
		System.out.println("Area of square is : " +side*side);
	}
	public void area(int length, int breadth) {
		System.out.println("Area of rectangle id : " +length*breadth);
	}
}

public class Task_polumorphism1 {

	public static void main(String[] args) {
		AreaCalculator a = new AreaCalculator();
		a.area(5);
		a.area(75, 2);

	}

}
