package com.jsp.hibernate_one_to_many_unidirectional.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_many_unidirectional.Branch;

public class BranchDao{
	//insertBranch
	public Branch saveBranch(Branch branch) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		
		
		return branch;
		
	}
	public List<Branch> displayBranch(){
		EntityManager entityManager =  Persistence.createEntityManagerFactory("ansari").createEntityManager();
		 String displayQuery = "SELECT b FROM Branch b";
		 return entityManager.createQuery(displayQuery).getResultList();
		 
	}
	public Branch getBranchById(int branchId)
	{
		EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
	     
		return entityManager.find(Branch.class, branchId);
		
	}
	

}