/**
 * 
 */
package hibernate_many_to_one_uni_direction.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_many_to_one_uni_direction.dto.Competition;
import hibernate_many_to_one_uni_direction.dto.Teams;

/**
 * @author pc
 *
 */
public class TeamDao {
	EntityManager entityManager = Persistence.createEntityManagerFactory("ansari").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Teams saveTeams(Teams teams,int comptitionId) {
		Competition competition = entityManager.find(Competition.class, comptitionId);
		if(competition != null) {
			teams.setCompetition(competition);
			entityTransaction.begin();
			entityManager.persist(teams);
			entityTransaction.commit();
		}
		
	
		return teams;
		
		
	}

}
