package com.jsp.hibernate_crud_dto_dao_service_controller1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_crud_dto_dao_service_controller1.dto.College;

public class CollegeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveCollege(College college) {
		entityTransaction.begin();
		entityManager.persist(college);
		entityTransaction.commit();
	}
	public College getById(int id) {
		College c = entityManager.find(College.class, id);
		return c;	
	}
	public void deleteCollege(int id) {
		 College c = entityManager.find(College.class, id);
		 entityTransaction.begin();
		 entityManager.remove(c);
		 entityTransaction.commit();
		 
	}
	public List<College> displayCollege(){
		String display = "SELECT A FROM College A";
		Query query = entityManager.createQuery(display);
		List<College>colleges = query.getResultList();
		return colleges;
	}
	
}
