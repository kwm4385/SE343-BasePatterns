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

    public Gateway(String driver, String dbms, String dbase, String user, String pswd) {
        this.driver = driver;
        this.dbms = dbms;
        this.dbase = dbase;
        this.user = user;
        this.password = pswd;
        this.dbaseName = dbms + "/" + dbase;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(dbaseName, user, password);
            statement = connection.createStatement();
        } catch (Exception e) {
                System.err.println("can't connect to " + dbaseName + " because " + e);
                try {
                    connection = DriverManager.getConnection(dbaseName + ";create=true");
                    statement = connection.createStatement();
                } catch (Exception e2) {
                     System.err.println("can't create " + dbaseName + " because " + e2);
                }
        }
    }

    public void finalize() throws SQLException {
        statement.close();
        connection.close();
    }

	public ResultSet execute(PreparedStatement sql) {
        ResultSet result = null;
        try {
			if (sql.executeQuery() != null) {
			    result = statement.getResultSet();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return result;
		
	}
}