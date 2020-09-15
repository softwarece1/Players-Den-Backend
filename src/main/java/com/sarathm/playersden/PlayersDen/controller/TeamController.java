package com.sarathm.playersden.PlayersDen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarathm.playersden.PlayersDen.model.Team;
import com.sarathm.playersden.PlayersDen.service.TeamService;

@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;

	@PostMapping(path="/teams")
	public Team registerTeam(@RequestBody Team team) {
		teamService.createTeam(team);
		
		return team;
	}
	
	@GetMapping(path="/team_scores")
	public List<Team> getAllTeamScores(){
		List<Team> team_scores = teamService.findAll();
		//for (Player list : team_scores) {

            //for (Integer n : list) {

               // System.out.printf("%d ", n);
            //}

            //System.out.println();
        
		return team_scores;
		//}
	}
	
	@GetMapping(path="/get_random_teams")
	public List<Team> getRandomTeams(){
		return teamService.getRandomTeams();
	}

}