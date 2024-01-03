package util;

import java.sql.Connection;

public class DBConnection {
    static Connection connection = null;

	public static Connection getConnection()
	{
		String propstr=DBPropertyUtil.getConnectionString("C:\\Users\\madha\\Downloads\\Ecom---Case-Study-main\\casestudy\\src\\main\\Main java\\util");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
