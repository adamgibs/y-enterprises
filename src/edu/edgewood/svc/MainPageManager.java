package edu.edgewood.svc;

import java.util.Collections;
import java.util.List;

import edu.edgewood.dao.MainPageDao;
import edu.edgewood.model.Posting;


public class MainPageManager {
	private MainPageDao dao;
	
	public MainPageManager() {
		dao = new MainPageDao();
	}
	
	public List<Posting> getAll() {
		try {
			return dao.getAll();
		}catch(Exception e) {
			e.printStackTrace();
			return Collections.EMPTY_LIST;
		}
	}
}
