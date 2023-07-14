package hibbernate_one_to_one_bidirectional.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibbernate_one_to_one_bidirectional.dao.laptopDao;
import hibbernate_one_to_one_bidirectional.dto.Employee;
import hibbernate_one_to_one_bidirectional.dto.Laptop;

public class InsertEmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = new Employee(10,"naveen","naveen123@gmail.com");
		Laptop laptop2 = new Laptop(11,"Dell","Black");
		employee.setLaptop(laptop2);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}

}
