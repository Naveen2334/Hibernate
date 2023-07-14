package com.jsp.hibernate_crud_dto_dao_service_controller1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class College {
	@Id
	private int collegeId;
	private String CollegeName;
	private String CollegeAddress;
	private String CollegeType;
	

	
}
