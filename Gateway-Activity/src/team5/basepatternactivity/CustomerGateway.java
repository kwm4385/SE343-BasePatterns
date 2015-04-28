package team5.basepatternactivity;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerGateway extends Gateway {

	public CustomerGateway(String driver, String dbms, String dbase, String user,
			String pswd) {
		super(driver, dbms, dbase, user, pswd);
	}
	
	public void createCustomer(int customerID, String lastName, String firstName, String address) throws SQLException {
		PreparedStatement sql = super.connection.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?)");
		sql.setInt(1, customerID);
		sql.setString(2, lastName);
		sql.setString(3, firstName);
		sql.setString(4, address);
		super.execute(sql);
	}
	
	public void viewCustomer(int customerID) throws SQLException {
		PreparedStatement sql = super.connection.prepareStatement("SELECT * FROM Customer WHERE customerID = ?");
		sql.setInt(1, customerID);
		super.execute(sql);
	}

}
