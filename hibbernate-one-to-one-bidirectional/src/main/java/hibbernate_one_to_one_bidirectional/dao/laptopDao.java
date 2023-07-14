package hibbernate_one_to_one_bidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibbernate_one_to_one_bidirectional.dto.Laptop;

public class laptopDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entitymanager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entitymanager.getTransaction();
	
	public void saveLaptop(Laptop laptop) {
		entityTransaction.begin();
		entitymanager.persist(laptop);
		entityTransaction.commit();
	}
	
	public void updateEmName(int lapId,String empName,String email)
	{
		Laptop laptop = getBylapId(lapId);
		if(laptop.getLaptopId()==lapId) {
			entityTransaction.begin();
			laptop.getEmployee().setEmpEmail(email);
			laptop.getEmployee().setEmpname(empName);
			entitymanager.merge(laptop);
			entityTransaction.commit();
			
			
		}
	}
	public Laptop getBylapId(int id) {
	  Laptop laptop =	entitymanager.find(Laptop.class, id);
	  return laptop;
	}
}
