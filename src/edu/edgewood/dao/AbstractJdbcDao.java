package edu.edgewood.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractJdbcDao {
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/y_enterprises";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    
    final protected Connection getConnection() throws SQLException
    {
        try
        {
            Connection myConnection;
            Class.forName(DRIVER_NAME);
            myConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return(myConnection);
        }
        catch(ClassNotFoundException cnfe)
        {
            throw new SQLException(cnfe);
        }
    }
    
    final protected void releaseResources(Connection conn, Statement stmt, ResultSet rs) {
    	if(rs != null) {
    		try {
    			rs.close();
    		}catch(Exception e){
    			
    		}
    	}
    	
    	if(stmt != null) {
    		try {
    			stmt.close();
    		}catch(Exception e){
    			
    		}
    	}
    	
    	if(conn != null) {
    		try {
    			conn.close();
    		}catch(Exception e){
    			
    		}
    	}
    	
    	
    	
    	
    }

}//class

