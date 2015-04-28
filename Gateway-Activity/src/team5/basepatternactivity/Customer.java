package team5.basepatternactivity;

public class Customer {
	
	private int customerID;
	private String lastName;
	private String firstName;
	private String address;

	public Customer(int customerID, String lastName, String firstName, String address) {
		this.customerID = customerID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;	
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
