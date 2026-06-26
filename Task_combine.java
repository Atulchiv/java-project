package java_project;

class Student3{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private String course;
}
public class Task_combine {

	public static void main(String[] args) {
		Student3 s = new Student3();
		s.setRollno(164);
		s.setName("Priya");
		s.setCourse("B.com");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCourse() );

	}

}
