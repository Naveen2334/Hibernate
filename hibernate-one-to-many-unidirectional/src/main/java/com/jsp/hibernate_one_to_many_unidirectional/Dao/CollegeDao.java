package com.jsp.hibernate_one_to_many_unidirectional.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_many_unidirectional.Branch;
import com.jsp.hibernate_one_to_many_unidirectional.College;

public class CollegeDao {
//insert method for college
	BranchDao branchDao = new BranchDao();
	public College saveCollege(College college,int branchId) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		List<Branch> branch = branchDao.displayBranch();
		if(branch!=null) {
			for(Branch branch2 : branch) {
				if(branch2.getBranchId()==branchId) {
					
					college.setBranch(branch);
					entityTransaction.begin();
					entityManager.persist(college);
					entityTransaction.commit();
					
					
				}
				
			}
		}
		
		return college;
		
	}
	//update college branchby id
/*	public void updateBranchBycollege(int branchId)
	{
		EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//get college kaha sai aiaega.....
		//List<College> college = getCollege();
		for(College college :colleges) {
           List<Branch> branchs = college.getBranchs();
           for(Branch branch:branchs) {
        	   if(branch.getBranchId()==branchId) {
        		   branch.setBranchBuilding(branchBuilding);
        		   entityTransaction.begin();
        		   entityManager.merge(branch);
        		   entityTransaction.commit();
        		   
        	   }
           }
		}
	
	}*/
}
