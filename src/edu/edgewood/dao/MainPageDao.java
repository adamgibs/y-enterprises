package edu.edgewood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import edu.edgewood.model.Posting;
import edu.edgewood.model.User;

public class MainPageDao extends AbstractJdbcDao{

	public List<Posting> getAll() throws Exception{
		String sql = "select * from posting order by created_date desc";	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			List<Posting> postings = new ArrayList<>();
			
			while(rs.next()) {
				Posting posting = createPosting(rs);
				postings.add(posting);
			}
			return postings;
		}finally {
			releaseResources(conn, stmt, rs);
		}
	}
	
	public User getUser(String id) throws Exception {
		String sql = "select * from user where id = ?";	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			
			if(rs.next()) {
				return createUser(rs);
			}
			return null;
			
			
			
		}finally {
			releaseResources(conn, stmt, rs);
		}
		
	}
	private Posting createPosting(ResultSet rs) throws Exception{
		String id = rs.getString("id");
		LocalDate createdDate = rs.getDate("created_date").toLocalDate();
		User createdBy = this.getUser(rs.getString("created_by"));
		String title = rs.getString("title");
		String shortDescription = rs.getString("short_description");
		String longDescription = rs.getString("long_description");
		LocalDateTime lastModified = rs.getTimestamp("last_modified").toLocalDateTime();
		User lastModifiedBy = this.getUser(rs.getString("last_modified_by"));
		
		Posting posting = new Posting();
		posting.setId(id);
		posting.setCreatedDate(createdDate);
		posting.setCreatedBy(createdBy);
		posting.setTitle(title);
		posting.setShortDescription(shortDescription);
		posting.setLongDescription(longDescription);
		posting.setLastModified(lastModified);
		posting.setLastModifiedBy(lastModifiedBy);
		
		return posting;
	}
	
	private User createUser(ResultSet rs) throws Exception{
		String id = rs.getString("id");
		String password = rs.getString("password");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		LocalDate createdDate = rs.getDate("created_date").toLocalDate();
		
		
		User user = new User();
		
		user.setUserId(id);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setCreatedDate(createdDate);
		
		return user;
	}
}

