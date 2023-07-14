package com.jsp.hibernate_crud_dto_dao_service_controller1.Controller;

import java.util.Scanner;

import com.jsp.hibernate_crud_dto_dao_service_controller1.Service.CollegeService;
import com.jsp.hibernate_crud_dto_dao_service_controller1.dto.College;

public class CollegeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollegeService service = new CollegeService();
		College college = new College();
          while(true) {
        	  System.out.println("Enter your Choice");
        	  System.out.println("1.insert");
        	  int ch = sc.nextInt();
        	  
        	  switch (ch) {
			case 1: {
				System.out.println("Enter the collegeId");
				int id = sc.nextInt();
				college.setCollegeId(id);
				System.out.println("Enter the collegeName");
				String name = sc.nextLine();
				name+=sc.next();
				college.setCollegeName(name);;
				System.out.println("Enter the collegeAdress");
				String adress = sc.next();
				college.setCollegeAddress(adress);
				System.out.println("Enter the collegeType");
				String type = sc.next();
				college.setCollegeType(type);
				service.saveCollege(college);
			}break;

			case 2:{
				System.out.println("Enter the collegeId");
				int id = sc.nextInt();
				CollegeService collegeService = new CollegeService();
				College c = collegeService.getById(id);
				System.out.println("College Id ="+c.getCollegeId());
				System.out.println("College Name ="+c.getCollegeName());
			//	System.out.println("College Address = "c.getCollegeAddress());
				System.out.println("College type ="+c.getCollegeType());
				
			}break;
			case 3:{
				System.out.println("Enter the CollegeId");
				int id = sc.nextInt();
				CollegeService collegeService = new CollegeService();
				collegeService.deleteCollege(id);
			}
			}
          }
	}

}
