package com.jsp.hibernate_one_to_many_unidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	private String collegeRating;
	private String collegeType;
	
	@OneToMany
	List<Branch> branch;
	
	

	

}
