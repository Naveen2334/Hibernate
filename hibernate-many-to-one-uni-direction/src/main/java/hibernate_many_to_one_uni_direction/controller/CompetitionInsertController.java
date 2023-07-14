package hibernate_many_to_one_uni_direction.controller;

import java.time.LocalDateTime;

import hibernate_many_to_one_uni_direction.dto.Competition;
import hibernate_many_to_one_uni_direction.service.CompetitionService;

public class CompetitionInsertController {
	public static void main(String[] args) {
		
		CompetitionService competitionService = new CompetitionService();
		Competition competition = new Competition();
		int year = LocalDateTime.now().getYear();
		System.out.println(year);
		competition.setCompetitionChairman("indianpremierleague");
		competition.setCompetitionYear(year);
		competition.setCompetitionName("indianpremierLeague");
		competition.setCompetitionName("dream 11");
		competitionService.saveCompetition(competition);
		
		
		
	}
}