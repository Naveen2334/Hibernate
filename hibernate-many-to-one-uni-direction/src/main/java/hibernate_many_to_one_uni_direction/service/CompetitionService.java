package hibernate_many_to_one_uni_direction.service;

import hibernate_many_to_one_uni_direction.dao.CompetitionDao;
import hibernate_many_to_one_uni_direction.dto.Competition;

public class CompetitionService {
	CompetitionDao competitionDao = new CompetitionDao();
	public Competition saveCompetition(Competition competition)
	{
		return competitionDao.saveCompetition(competition) ;
		
	}

}
