package hibernate_many_to_one_uni_direction.service;

import hibernate_many_to_one_uni_direction.dao.TeamDao;
import hibernate_many_to_one_uni_direction.dto.Teams;

public class TeamService {
     TeamDao dao = new TeamDao();
     public Teams saveTeams(Teams teams , int competitionId)
     {
    	 
		return dao.saveTeams(teams, competitionId);
    	 
     }
}
