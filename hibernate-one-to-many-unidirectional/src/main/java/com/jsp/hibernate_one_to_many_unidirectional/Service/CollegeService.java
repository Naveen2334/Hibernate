package com.jsp.hibernate_one_to_many_unidirectional.Service;

import com.jsp.hibernate_one_to_many_unidirectional.College;
import com.jsp.hibernate_one_to_many_unidirectional.Dao.CollegeDao;

public class CollegeService {

	CollegeDao collegeDao = new CollegeDao();
	
	public College savecollege(College college,int branchId) {
		return collegeDao.saveCollege(college, branchId);
		
}//update college branchById
	
	
	}
