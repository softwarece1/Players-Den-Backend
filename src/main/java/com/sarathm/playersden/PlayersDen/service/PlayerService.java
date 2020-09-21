package com.sarathm.playersden.PlayersDen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarathm.playersden.PlayersDen.model.Player;
import com.sarathm.playersden.PlayersDen.repository.PlayerRepository;

@Service
@Transactional
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public Player createPlayer(Player player) {
		playerRepository.save(player);
		return player;
	}
	public List<Player> findPlayersByTeamName(String playerTeamName){
		List<Player> p = playerRepository.findByPlayerTeamName(playerTeamName);
		return p;
	}
	
	public List<Player> getFirstTeamPlayers(String teamName) {
		// TODO Auto-generated method stub
		return playerRepository.findFirstTeamPlayers(teamName);
	}
	public long updatePlayerScore(String player_name,long player_value, long prev_score) {
		// TODO Auto-generated method stub
		long l =  (long) ((Math.random() * (player_value - 1)) + 1);
		l = l * 10;
		l = l + prev_score;
		 playerRepository.updatePlayerScore(player_name,l);
		return l;
	}
	
	public void clearScores() {
		playerRepository.clearScores();
	}

}
