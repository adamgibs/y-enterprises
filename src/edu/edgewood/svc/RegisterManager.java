package edu.edgewood.svc;

import edu.edgewood.dao.RegisterDao;
import edu.edgewood.model.User;

public class RegisterManager {
private RegisterDao dao;
	
	public RegisterManager() {
		dao = new RegisterDao();
	}
	
	public boolean add(User user) {
		try {
			dao.insert(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
