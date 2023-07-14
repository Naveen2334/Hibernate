package hibernate_many_to_one_uni_direction.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_many_to_one_uni_direction.dto.Competition;

public class CompetitionDao {
	EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public Competition saveCompetition(Competition competition) {
		entityTransaction.begin();
		entityManager.persist(competition);
		entityTransaction.commit();
		return competition;
		
	}

}
