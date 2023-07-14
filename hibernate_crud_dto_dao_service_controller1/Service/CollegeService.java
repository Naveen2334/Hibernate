package com.jsp.hibernate_crud_dto_dao_service_controller1.Service;

import com.jsp.hibernate_crud_dto_dao_service_controller1.dao.CollegeDao;
import com.jsp.hibernate_crud_dto_dao_service_controller1.dto.College;

public class CollegeService {
	CollegeDao collegeDao = new CollegeDao();

	public void saveCollege(College college) 
	{
		collegeDao.saveCollege(college);
	}
	public College getById(int id) {
		return collegeDao.getById(id);
		
	}
	public void deleteCollege(int id) {
		if(collegeDao.getById(id).getCollegeId()==id) {
			collegeDao.deleteCollege(id);
			System.out.println("data is deleted");
		}
	}
	

}
