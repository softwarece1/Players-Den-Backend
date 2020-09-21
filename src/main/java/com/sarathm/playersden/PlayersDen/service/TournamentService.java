package com.sarathm.playersden.PlayersDen.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarathm.playersden.PlayersDen.model.Tournament;
import com.sarathm.playersden.PlayersDen.repository.TournamentRepository;
@Service
@Transactional
public class TournamentService {
	@Autowired
	private TournamentRepository tournRepository;

	public List<Tournament> getAllTournaments() {
		// TODO Auto-generated method stub
		return tournRepository.findTournaments();
	}

	public Tournament getTournamentByNumber(long tournament_number) {
		// TODO Auto-generated method stub
		return tournRepository.getTournamentByNumber(tournament_number);
	}

	public List<Tournament> getTournamentBydate(Date tournament_date) {
		// TODO Auto-generated method stub
		return tournRepository.findByTId(tournament_date);
	}

	public void createTournament(long tournament_number, Date tournament_date) {
		tournRepository.saveT(tournament_number,tournament_date);
		
	}

	public long getTournamentsCount() {
		// TODO Auto-generated method stub
		return tournRepository.count();
	}
	


}
