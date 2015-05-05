package team5.basepatternactivity;

import java.sql.*;

/**
 * A gateway can be anything that hides access to a remote server or a complex library.
 * 
 * @author amk5401
 */
public class Gateway {

    protected String driver;
    protected String dbms;
    protected String dbase;
    protected String dbaseName;

    protected String user;
    protected String password;

    protected Connection connection;
    protected Statement statement;

    public Gateway(String driver, String dbaseName, String user, String pswd) {
        this.driver = driver;
        this.user = user;
        this.password = pswd;
        this.dbaseName = dbaseName;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(dbaseName, user, password);
        } catch (Exception e) {
                System.err.println("can't connect to " + dbaseName + " because " + e);
        }
    }

    public void finalize() throws SQLException {
        statement.close();
        connection.close();
    }

	public ResultSet execute(PreparedStatement sql) throws SQLException {
        ResultSet result = null;
        try {
			if (sql.executeQuery() != null) {
			    result = sql.getResultSet();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println(result);
        return result;
		
	}
}