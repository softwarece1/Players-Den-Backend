package com.sarathm.playersden.PlayersDen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarathm.playersden.PlayersDen.model.Team;
import com.sarathm.playersden.PlayersDen.repository.TeamRepository;

@Service
@Transactional
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	public Team createTeam(Team team) {
		teamRepository.save(team);
		return team;
	}

}