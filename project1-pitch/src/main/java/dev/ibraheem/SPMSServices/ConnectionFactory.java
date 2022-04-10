package dev.ibraheem.SPMSServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
	//The conn factory is responsible for generating an object and returning it.
	//a single stance is a design pattern where we only create one single instance 
	//of a class stage memory so we're not 
	
	//singleton design pattern
	// - private - only this class can access it -- static, belongs
	//to this class rather than a specific instance

	private static Connection  connection = null;
	
	public static Connection getConnection()	{	// static bc it's following a static method
		
		
		if (connection == null)	{
			ResourceBundle bundle = ResourceBundle.getBundle("dbConfig");
			String url = bundle.getString("url");
			String username = bundle.getString("username");
			String password = bundle.getString("password");
			
		
		
		try {
			//If there are issues connecting, the driver needs to be registered
			//Class.forName("org.postgresql.driver");
			connection = DriverManager.getConnection(url, username, password );
		} catch (SQLException e)	{
			e.printStackTrace();
		}
			
		}
		return connection;
	}
}
