package java_project;

abstract class Payment{
	abstract void pay();
}
class UPIPayment extends Payment{
	void pay() {
		System.out.println("Pay the Payment in my scanner");
	}
}
public class Task_abstraction1 {

	public static void main(String[] args) {
		Payment p = new UPIPayment();
		p.pay();

	}

}
