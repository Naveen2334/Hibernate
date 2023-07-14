package hibbernate_one_to_one_bidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibbernate_one_to_one_bidirectional.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// why i am calling laptop

	public void saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public Employee getEmployeeId(int id) {
		return entityManager.find(Employee.class, id);
	}

	public java.util.List<Employee> displayAll() {
		String display = "Select A from Employee A";
		return entityManager.createQuery(display, Employee.class).getResultList();
	}
	 public void updateLapColor(int empid,String color)
	 {
		 Employee employee1 = entityManager.find(Employee.class, empid);
		 System.out.println(employee1);
		 if(employee1.getEmpId()==empid);
		 {
			 employee1.getLaptop().setLaptopColor(color);
			 entityTransaction.begin();
			 entityManager.merge(employee1);
			 entityTransaction.commit();
		 }
//		 else {
//			 System.out.println("id not present");
//			 
//			System.out.println(employee.getEmpId());
//		 }
	 
	 }
}
