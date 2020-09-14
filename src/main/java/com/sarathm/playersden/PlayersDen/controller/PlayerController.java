package com.sarathm.playersden.PlayersDen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping(path="/team/player")
	public void registerPlayer(@RequestBody Player player) {
		playerService.createPlayer(player);
	}

}
