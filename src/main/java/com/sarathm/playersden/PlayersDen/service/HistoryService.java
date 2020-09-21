package com.sarathm.playersden.PlayersDen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarathm.playersden.PlayersDen.model.History;
import com.sarathm.playersden.PlayersDen.repository.HistoryRepository;

@Service
@Transactional
public class HistoryService {
	
	@Autowired
	private HistoryRepository hRepository;

	public void saveHistory(History history) {
		// TODO Auto-generated method stub
		hRepository.save(history);
		
	}

}
