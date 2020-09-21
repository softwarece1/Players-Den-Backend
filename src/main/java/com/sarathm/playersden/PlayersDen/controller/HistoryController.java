package com.sarathm.playersden.PlayersDen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarathm.playersden.PlayersDen.model.History;
import com.sarathm.playersden.PlayersDen.model.Team;
import com.sarathm.playersden.PlayersDen.service.HistoryService;
import com.sarathm.playersden.PlayersDen.service.TeamService;
import com.sarathm.playersden.PlayersDen.service.TournamentService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HistoryController {
	
	@Autowired
	private TournamentService tService;
	
	@Autowired
	private HistoryService hService;
	
	@Autowired
	private TeamService teamService;
	
	@PutMapping(path="/update_tournament/")
	public long updateTournamnets(@RequestBody long l) {
		long tournamentsCount = tService.getTournamentsCount(); 
//		List<Team> teams = teamService.findAll();
		for(Team team : teamService.findAll()) {
			History history = new History();
			history.settHistoryId(tournamentsCount);
			history.settHistoryTeam(team.getTeamName());
			history.settHistoryScore(team.getTeamScore());
			hService.saveHistory(history);
		}
		return 0;
		
	}

}
