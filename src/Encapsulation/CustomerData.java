package Encapsulation;

public class CustomerData {

	// encapsulation called data hiding
	// Encapsulation - OOP concept

	private String cName;
	private int cAge;
	private int cDob;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcAge() {
		return cAge;
	}

	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

	public int getcDob() {
		return cDob;
	}

	public void setcDob(int cDob) {
		this.cDob = cDob;
	}

	public static void main(String[] args) {
		CustomerData c = new CustomerData();
		c.setcName("mehedi");
		c.setcAge(30);
		c.setcDob(10101980);

		System.out.println("Customer Name: " + c.getcName());
		System.out.println("Customer Age: " + c.getcAge());
		System.out.println("Customer Dob: " + c.getcDob());

	}

}
