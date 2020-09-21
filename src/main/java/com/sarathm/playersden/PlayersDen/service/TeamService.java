package com.sarathm.playersden.PlayersDen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarathm.playersden.PlayersDen.model.Team;
import com.sarathm.playersden.PlayersDen.repository.TeamRepository;

@Service
@Transactional
public class TeamService{
	
	@Autowired
	private TeamRepository teamRepository;
	
	public Team createTeam(Team team) {
		teamRepository.save(team);
		return team;
	}
	
	public List<Team> findAll(){
		return teamRepository.findAll();
	}
	
	public List<Team> getRandomTeams(){
		return teamRepository.findTeam();
	}

	public void updateTeamScore(String team_name, long team_score) {
		// TODO Auto-generated method stub
		teamRepository.updateTeamScore(team_name,team_score);
		
	}

	public Long getTeamScore(String team_name) {
		// TODO Auto-generated method stub
		return teamRepository.getTeamScore(team_name);
	}

	public void clearTeamScores() {
		// TODO Auto-generated method stub
		teamRepository.clearTeamScores();
		
	}

	public long getTeamNameCount(String team_name) {
		// TODO Auto-generated method stub
		return teamRepository.getTeamCountScore(team_name);
	}

}