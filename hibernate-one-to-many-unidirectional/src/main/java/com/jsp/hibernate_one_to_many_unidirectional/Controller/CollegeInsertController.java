package com.jsp.hibernate_one_to_many_unidirectional.Controller;

import com.jsp.hibernate_one_to_many_unidirectional.College;
import com.jsp.hibernate_one_to_many_unidirectional.Service.CollegeService;

public class CollegeInsertController {
	public static void main(String[] args) {
		CollegeService collegeService =  new CollegeService();
		
		College college = new College();
		college.setCollegeId(851);
		college.setCollegeName("DU");
		college.setCollegeAddress("Delhi");
		college.setCollegeType("Engineering");
		collegeService.savecollege(college, 124);
	}

}
  