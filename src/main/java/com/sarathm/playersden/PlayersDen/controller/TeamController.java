package com.sarathm.playersden.PlayersDen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return team_scores;
	}
	
	@GetMapping(path="/get_random_teams")
	public List<Team> getRandomTeams(){
		return teamService.getRandomTeams();
	}
	
	@PutMapping(path="/{team_name}/{team_score}")
	public long updateTeamScore(@PathVariable String team_name, @PathVariable long team_score, @RequestBody Team team) {
		teamService.updateTeamScore(team_name,team_score);
		return 0;
	}
	
	@GetMapping(path="/{team_name}")
	public Long getTeamScore(@PathVariable String team_name) {
		return teamService.getTeamScore(team_name);
	}
	
	@PutMapping(path="/clear_team_scores")
	public long clearTeamScores() {
		teamService.clearTeamScores();
		return 0;
	}
	
	@GetMapping(path="/{team_name}/count")
	public long getTeamNameCount(@PathVariable String team_name) {
		return teamService.getTeamNameCount(team_name);
	}
}