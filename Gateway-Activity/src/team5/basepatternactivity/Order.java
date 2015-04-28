package team5.basepatternactivity;

public class Order {
	
	private int orderID;
	private double total;
	private int customer;

	public Order(int orderID, double total, int customer) {
		this.orderID = orderID;
		this.total = total;
		this.customer = customer;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public int getCustomer() {
		return customer;
	}

}