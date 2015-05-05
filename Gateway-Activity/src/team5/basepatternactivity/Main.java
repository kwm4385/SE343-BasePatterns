package team5.basepatternactivity;

import java.util.ArrayList;

public class Main {
	public static void main( String args[] ) {
		try {
			Gateway g = new Gateway("org.sqlite.Driver", "jdbc:sqlite:test.db", "root", "krutzkrtuz");
			System.out.println("Opened database successfully (use fake data in this example)");
			CustomerGateway customerGateway = new CustomerGateway(g.driver, g.dbaseName, g.user, g.password);
			OrderGateway orderGateway = new OrderGateway(g.driver, g.dbaseName, g.user, g.password);
			
			customerGateway.createCustomer(6, "Krutz", "Daniel", "His House");
			System.out.println("Customer 6: "); 
			customerGateway.viewCustomer(6);
			
			orderGateway.createOrder(1, 10.00, 6);
			System.out.println("Order 1: "); 
			orderGateway.viewOrder(1);
			
			System.out.println("Done");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
	
	public ArrayList<Customer> createFakeCustomers(){
		ArrayList<Customer> fakeCustomers = new ArrayList<Customer>();
		fakeCustomers.add(new Customer(1, "Klein", "Austin", "My House"));
		fakeCustomers.add(new Customer(2, "Berl", "Geoff", "His House"));
		fakeCustomers.add(new Customer(3, "Moses", "Kevin", "His House"));
		fakeCustomers.add(new Customer(4, "Shulman", "Jeremy", "His House"));
		fakeCustomers.add(new Customer(5, "Ksiazek", "Joseph", "His House"));
		return fakeCustomers;
	}
	
	public ArrayList<Order> createFakeOrders(){
		ArrayList<Order> fakeOrders = new ArrayList<Order>();
		fakeOrders.add(new Order(1, 10.00, 1));
		fakeOrders.add(new Order(2, 1.30, 3));
		fakeOrders.add(new Order(3, 23.02, 3));
		fakeOrders.add(new Order(4, .01, 4));
		return fakeOrders;
	}
}
