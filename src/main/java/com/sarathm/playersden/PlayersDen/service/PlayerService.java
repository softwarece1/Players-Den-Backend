package com.sarathm.playersden.PlayersDen.service;

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

}
