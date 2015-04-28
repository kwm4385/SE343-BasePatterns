package team5.basepatternactivity;

public class Main {
	public static void main( String args[] ) {
	try {
		Gateway g = new Gateway("org.sqlite.JDBC", "jdbc", "jdbc:sqlite:test.db", "root", "krutz");
		System.out.println("Opened database successfully");
		CustomerGateway customerGateway = new CustomerGateway(g.driver, g.dbms, g.dbaseName, g.user, g.password);
		customerGateway.createCustomer(1, "Klein", "Austin", "My House");
		customerGateway.viewCustomer(1);
	} catch ( Exception e ) {
		System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		System.exit(0);
	}
}
}
