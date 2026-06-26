package java_project;
class Employee{
	private int employeeid;
	private String employeename;
	private int employeesalary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
}
public class Task_encapsulation1 {

	public static void main(String[] args) {
		Employee E = new Employee();
		E.setEmployeeid(164);
		E.setEmployeename("Atul");
		E.setEmployeesalary(120000);
		System.out.println(E.getEmployeeid());
		System.out.println(E.getEmployeename());
		System.out.println(E.getEmployeesalary());
		

	}

}
