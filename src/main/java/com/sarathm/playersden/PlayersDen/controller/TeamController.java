package com.sarathm.playersden.PlayersDen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

}