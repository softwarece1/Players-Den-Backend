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

import com.sarathm.playersden.PlayersDen.model.Player;
import com.sarathm.playersden.PlayersDen.service.PlayerService;
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	@PostMapping(path="/player")
	public void registerPlayer(@RequestBody Player player) {
		playerService.createPlayer(player);
	}
	
	@GetMapping(path="/player_details")
	public List<Player> findPlayerDetails(){
	    List<Player> s = playerService.findPlayersByTeamName("stars");
	   return s;
	}
	
	@GetMapping(path="/{teamName}/get_first_team_players")
	public List<Player> findFirstTeamPlayers(@PathVariable String teamName ){
		return playerService.getFirstTeamPlayers(teamName);
	}
	
	@PutMapping(path="/{player_name}/{player_value}/{prev_score}")
	public long updatePlayerScore(@PathVariable String player_name,@PathVariable long player_value, @PathVariable long prev_score, @RequestBody Player player ) {
		return playerService.updatePlayerScore(player_name,player_value,prev_score);
	}
	
	@PutMapping(path="/clear_scores")
	public long clearScores(@RequestBody String player) {
		playerService.clearScores();
		return 0;
	}
	
	
	
	

}
