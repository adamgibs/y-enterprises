package edu.edgewood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import edu.edgewood.model.User;


public class RegisterDao extends AbstractJdbcDao {
	public void insert(User user) throws Exception {
		String sql = "insert into user(id, password, first_name, last_name, create_date) "
				+ " values(?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getUserId());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getFirstName());
			stmt.setString(4, user.getLastName());
			stmt.setDate(5, java.sql.Date.valueOf( user.getCreatedDate() ));
			
			stmt.execute();
			
		}finally {
			releaseResources(conn, stmt, null);
		}
	}
}
