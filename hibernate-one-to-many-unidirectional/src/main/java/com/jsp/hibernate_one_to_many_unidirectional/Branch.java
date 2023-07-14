package com.jsp.hibernate_one_to_many_unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Branch {
	@Id
	private int branchId;
	private String branchName;
	private String branchBuilding;

	
		
}


