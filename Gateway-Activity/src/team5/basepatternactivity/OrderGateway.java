package team5.basepatternactivity;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderGateway extends Gateway {

	public OrderGateway(String driver, String dbms, String dbase, String user,
			String pswd) {
		super(driver, dbms, dbase, user, pswd);
	}

	public void createOrder(int orderID, double total, int customer) throws SQLException {
		PreparedStatement sql = super.connection.prepareStatement("INSERT INTO Order VALUES(?,?,?)");
		sql.setInt(1, orderID);
		sql.setDouble(2, total);
		sql.setInt(3, customer);
		super.execute(sql);
	}
	
	public void viewOrder(int orderID) throws SQLException {
		PreparedStatement sql = super.connection.prepareStatement("SELECT * FROM Order WHERE orderID = ?");
		sql.setInt(1, orderID);
		super.execute(sql);
	}
}
